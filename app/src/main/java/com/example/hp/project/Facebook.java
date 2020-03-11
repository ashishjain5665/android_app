package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Facebook extends AppCompatActivity {
    Button b;
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        b=(Button)findViewById(R.id.button37);
        w=(WebView)findViewById(R.id.webView2);
        w.loadUrl("https://www.facebook.com");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Facebook.this , Result.class);
                startActivity(i);
                finish();
            }
        });
    }
}
