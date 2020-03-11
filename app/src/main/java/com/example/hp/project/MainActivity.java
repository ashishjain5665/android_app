package com.example.hp.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.RatingCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("") || s2.equals("")){
                    Toast.makeText(MainActivity.this, "PLEASE FILL ALL DETAILS", Toast.LENGTH_SHORT).show();
                }
                else{
                    SQLiteDatabase data = openOrCreateDatabase("Pro",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists cus(username varchar, password varchar,email varchar ,city varchar ,phone varchar)");
                    String s3="select * from cus where(username='"+s1+"' and password='"+s2+"')";
                    Cursor c=data.rawQuery(s3 ,null);
                    if(c.getCount()>0){
                        Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(MainActivity.this ,On.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "PLEASE SIGN UP FIRST THEN TRY", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this ,Sign.class);
                startActivity(i);
                finish();
            }
        });
    }
}
