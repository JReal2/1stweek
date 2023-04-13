package com.example.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Switch start;
    RadioGroup rGroup;
    RadioButton q, r, s;
    ImageView imgVersion;
    Button exit, init;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.Text);
        start = (Switch) findViewById(R.id.Start);
        rGroup = (RadioGroup) findViewById(R.id.RGroup1);
        q = (RadioButton) findViewById(R.id.Q);
        r = (RadioButton) findViewById(R.id.R);
        s = (RadioButton) findViewById(R.id.S);
        imgVersion = (ImageView) findViewById(R.id.ImgVersion);
        exit = (Button) findViewById(R.id.Exit);
        init = (Button) findViewById(R.id.Init);

        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    text.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                    init.setVisibility(View.VISIBLE);
                }
                else {
                    text.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    exit.setVisibility(View.INVISIBLE);
                    init.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.Q:
                        imgVersion.setVisibility(View.VISIBLE);
                        imgVersion.setImageResource(R.drawable.q);
                        break;
                    case R.id.R:
                        imgVersion.setVisibility(View.VISIBLE);
                        imgVersion.setImageResource(R.drawable.r);
                        break;
                    case R.id.S:
                        imgVersion.setVisibility(View.VISIBLE);
                        imgVersion.setImageResource(R.drawable.s);
                        break;
                    default:
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setVisibility(View.INVISIBLE);
                rGroup.setVisibility(View.INVISIBLE);
                exit.setVisibility(View.INVISIBLE);
                init.setVisibility(View.INVISIBLE);
                imgVersion.setVisibility(View.INVISIBLE);
                start.setChecked(false);
            }
        });
    }
}