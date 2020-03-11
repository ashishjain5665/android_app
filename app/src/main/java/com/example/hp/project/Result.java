package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t;
    WebView w;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
         b1=(Button)findViewById(R.id.button32);
         b2=(Button)findViewById(R.id.button33);
         b3=(Button)findViewById(R.id.button34);
         b4=(Button)findViewById(R.id.button35);
         t=(TextView)findViewById(R.id.textView12);
         t.setText("Your score is  "+Quiz.score);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(Result.this ,Facebook.class);
                 startActivity(i);
                 finish();
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(Result.this ,Twitter.class);
                 startActivity(i);
                 finish();
             }
         });
         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(Result.this ,Netcap.class);
                 startActivity(i);
                 finish();
             }
         });
         b4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(Result.this ,On.class);
                 startActivity(i);
                 finish();
             }
         });

     }
}
