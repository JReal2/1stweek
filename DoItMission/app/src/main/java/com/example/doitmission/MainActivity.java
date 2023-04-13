package com.example.doitmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1, img2;
    Button up, down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        img1.setImageResource(R.drawable.img2);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.img2);
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(R.drawable.img2);
                img2.setVisibility(View.VISIBLE);
                img1.setVisibility(View.INVISIBLE);
            }
        });
    }
}