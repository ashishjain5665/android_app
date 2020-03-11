package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    Button b1,b2;
    CheckBox c1,c2,c3,c4;
    TextView t;
    static Integer score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        b1=(Button)findViewById(R.id.button26);
        b2=(Button)findViewById(R.id.button27);
        t=(TextView)findViewById(R.id.textView7);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Quiz.this , Sp.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(c1.isChecked() && c2.isChecked()){
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c2.isChecked() && c3.isChecked()){
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c3.isChecked() && c4.isChecked()){
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c4.isChecked() && c1.isChecked()){
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c1.isChecked() && c3.isChecked()){
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c4.isChecked() && c2.isChecked()) {
                    Toast.makeText(Quiz.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c2.isChecked()){
                    ++score;
                }
                Intent i =new Intent(Quiz.this ,Second.class);
                startActivity(i);
                finish();
            }
        });

    }
}
