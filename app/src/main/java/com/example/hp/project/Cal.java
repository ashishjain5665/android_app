package com.example.hp.project;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Cal extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView t1,t2;
    EditText e1,e2;
    TextToSpeech tt;
    String q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        b7=(Button)findViewById(R.id.button15);
        b1=(Button)findViewById(R.id.button16);
        b2=(Button)findViewById(R.id.button17);
        b3=(Button)findViewById(R.id.button18);
        b4=(Button)findViewById(R.id.button19);
        b5=(Button)findViewById(R.id.button20);
        b6=(Button)findViewById(R.id.button21);
        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView4);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        tt=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                tt.setLanguage(Locale.ENGLISH);
                tt.setSpeechRate(0.3f);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Cal.this , On.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("") || s2.equals("")){
                    Toast.makeText(Cal.this, "ENTER NUMBER CAREFULLY", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float i1=Float.valueOf(s1);
                    Float i2=Float.valueOf(s2);


                    Float i3=i1 +i2;
                    String s3=" YOUR ANSWER IS " + Float.toString(i3);
                    t2.setText(s3);
                    q=s3;
                    Toast.makeText(Cal.this, "ADDITION SUCCESFULL", Toast.LENGTH_SHORT).show();
                    }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("") || s2.equals("")){
                    Toast.makeText(Cal.this, "ENTER NUMBER CAREFULLY", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float i1=Float.valueOf(s1);
                    Float i2=Float.valueOf(s2);


                    Float i3=i1 -i2;
                    String s3=" YOUR ANSWER IS " + Float.toString(i3);
                    t2.setText(s3);
                    q=s3;
                    Toast.makeText(Cal.this, "SUBTRACTION SUCCESFULL", Toast.LENGTH_SHORT).show();
                    }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("") || s2.equals("")){
                    Toast.makeText(Cal.this, "ENTER NUMBER CAREFULLY", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float i1=Float.valueOf(s1);
                    Float i2=Float.valueOf(s2);


                    Float i3=i1 *i2;
                    String s3=" YOUR ANSWER IS " + Float.toString(i3);
                    t2.setText(s3);
                    q=s3;
                    Toast.makeText(Cal.this, "MULTIPLICATION SUCCESFULL", Toast.LENGTH_SHORT).show();

                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("") || s2.equals("")){
                    Toast.makeText(Cal.this, "ENTER NUMBER CAREFULLY", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float i1=Float.valueOf(s1);
                    Float i2=Float.valueOf(s2);


                    Float i3=i1 /i2;
                    String s3=" YOUR ANSWER IS " + Float.toString(i3);
                    t2.setText(s3);
                    q=s3;
                    Toast.makeText(Cal.this, "DIVISION SUCCESFULL", Toast.LENGTH_SHORT).show();

                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tt.speak(q, TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t2.setText("");
            }
        });

    }
}
