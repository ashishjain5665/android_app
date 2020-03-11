package com.example.hp.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        e4=(EditText)findViewById(R.id.editText6);
        e5=(EditText)findViewById(R.id.editText7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                String s5=e5.getText().toString();
                if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("")){
                    Toast.makeText(Sign.this, "PLEASE FILL ALL DETAILS", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase data = openOrCreateDatabase("Pro",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists cus(username varchar, password varchar,email varchar ,city varchar ,phone varchar)");
                    String s6="select * from cus where(username='"+s1+"' and email='"+s4+"' and phone='"+s5+"')";
                    Cursor c=data.rawQuery(s6 ,null);
                    if(c.getCount()>0){
                        Toast.makeText(Sign.this, "USER EXISTS", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        data.execSQL("insert into cus values('"+s1+"' , '"+s2+"' ,'"+s4+"' ,'"+s3+"' ,'"+s5+"')");
                        Toast.makeText(Sign.this, "WELCOME", Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(Sign.this ,On.class);
                        startActivity(i);
                        finish();
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Sign.this ,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
