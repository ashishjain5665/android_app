package com.example.hp.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MediaP extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView w;
    TextView t;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_p);
        b1=(Button)findViewById(R.id.button10);
        b2=(Button)findViewById(R.id.button12);
        b3=(Button)findViewById(R.id.button11);
        w=(ImageView)findViewById(R.id.imageView2);
        t=(TextView)findViewById(R.id.textView);
        mp=MediaPlayer.create(this, R.raw.teri);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaP.this , On.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
    }
}
