package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twitter extends AppCompatActivity {
    Button b;
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        b=(Button)findViewById(R.id.button36);
        w=(WebView)findViewById(R.id.webView);
        w.loadUrl("https://www.twitter.com");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Twitter.this , Result.class);
                startActivity(i);
                finish();
            }
        });
    }
}
