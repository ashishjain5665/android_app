package com.example.hp.project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Camera extends AppCompatActivity {
    Button b1,b2;
    ImageView w;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        w=(ImageView)findViewById(R.id.imageView3);
        t=(TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Camera.this , On.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i ,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode , resultCode,data);
        Bitmap bm=(Bitmap)data.getExtras().get("data");
        w.setImageBitmap(bm);
    }
}
