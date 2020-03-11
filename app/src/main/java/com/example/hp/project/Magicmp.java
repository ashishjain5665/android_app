package com.example.hp.project;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Magicmp extends AppCompatActivity implements SensorEventListener {
    Button b;
    TextView t1,t2;
    ImageView w;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magicmp);
        b=(Button)findViewById(R.id.button25);
        w=(ImageView)findViewById(R.id.imageView5);
        t1=(TextView)findViewById(R.id.textView5);
        t2=(TextView)findViewById(R.id.textView6);
        mp=MediaPlayer.create(this , R.raw.teri);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Magicmp.this , Sp.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.values[0]>5){
            if(mp.isPlaying()){
                mp.stop();
                mp.reset();
            }
            mp.start();
        }
        if(mp.isPlaying()){
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
