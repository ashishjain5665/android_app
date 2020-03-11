package com.example.hp.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class On extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    ImageView W;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on);
        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button6);
        b3=(Button)findViewById(R.id.button7);
        b4=(Button)findViewById(R.id.button8);
        b5=(Button)findViewById(R.id.button9);
        W=(ImageView)findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(On.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(On.this,MediaP.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(On.this,Camera.class);
                startActivity(i);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(On.this,Cal.class);
                startActivity(i);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(On.this,Sp.class);
                startActivity(i);
                finish();
            }
        });

    }
}
