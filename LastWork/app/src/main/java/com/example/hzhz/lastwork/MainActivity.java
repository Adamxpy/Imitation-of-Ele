package com.example.hzhz.lastwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView_vip;
    private ImageView imageView_tupian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_vip = (ImageView) findViewById(R.id.image_vip);
        imageView_tupian = (ImageView) findViewById(R.id.image_view1);
        Button button1 = (Button) findViewById(R.id.nextview_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_tupian.setImageResource(R.drawable.view1);
            }
        });
        Button button2 = (Button) findViewById(R.id.nextview_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_tupian.setImageResource(R.drawable.view2);
            }
        });
        Button button3 = (Button) findViewById(R.id.nextview_button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_tupian.setImageResource(R.drawable.view3);
            }
        });
        Button button4 = (Button) findViewById(R.id.nextview_button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_tupian.setImageResource(R.drawable.view4);
            }
        });

        imageView_vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
