package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button b2;
    CheckBox c1,c2,c3,c4;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b2=(Button)findViewById(R.id.button28);
        t=(TextView)findViewById(R.id.textView8);
        c1=(CheckBox)findViewById(R.id.checkBox5);
        c2=(CheckBox)findViewById(R.id.checkBox6);
        c3=(CheckBox)findViewById(R.id.checkBox7);
        c4=(CheckBox)findViewById(R.id.checkBox8);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked() && c2.isChecked()){
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c2.isChecked() && c3.isChecked()){
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c3.isChecked() && c4.isChecked()){
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c4.isChecked() && c1.isChecked()){
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c1.isChecked() && c3.isChecked()){
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c4.isChecked() && c2.isChecked()) {
                    Toast.makeText(Second.this, "Please select only one option", Toast.LENGTH_SHORT).show();
                }else if(c1.isChecked()){
                    ++Quiz.score;
                }
                Intent i =new Intent(Second.this ,Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
