package com.example.hp.project;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sp extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        b1=(Button)findViewById(R.id.button22);
        b2=(Button)findViewById(R.id.button23);
        b3=(Button)findViewById(R.id.button24);
        w=(ImageView)findViewById(R.id.imageView4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sp.this ,On.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sp.this ,Quiz.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sp.this ,Magicmp.class);
                startActivity(i);
                finish();
            }
        });

    }
}
