package com.example.userinterfacepart3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox loki,strange,ant;
    private RadioGroup radioGroup;
    private ProgressBar bar;
    private ProgressBar horbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loki=findViewById(R.id.loki);
        strange=findViewById(R.id.strange);
        ant=findViewById(R.id.ant);
        radioGroup=findViewById(R.id.group);
        bar=findViewById(R.id.bar);
        horbar=findViewById(R.id.horizontalbar);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    horbar.incrementProgressBy(10);
                    SystemClock.sleep(1000);
                }
            }
        });
        thread.start();





        int checked=radioGroup.getCheckedRadioButtonId();
        switch (checked) {
            case R.id.liked:
                Toast.makeText(MainActivity.this,"You liked",Toast.LENGTH_SHORT).show();
                bar.setVisibility(View.VISIBLE);
                break;
            case R.id.disliked:
                Toast.makeText(MainActivity.this,"You disliked",Toast.LENGTH_SHORT).show();

                break;
            case R.id.notdetermined:
                Toast.makeText(MainActivity.this,"You are undetermined",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.liked:
                        Toast.makeText(MainActivity.this,"You liked",Toast.LENGTH_SHORT).show();
                        bar.setVisibility(View.VISIBLE);
                        break;
                    case R.id.disliked:
                        Toast.makeText(MainActivity.this,"You disliked",Toast.LENGTH_SHORT).show();
                        bar.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.notdetermined:
                        Toast.makeText(MainActivity.this,"You are undetermined",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });



        if(loki.isChecked()) {
            Toast.makeText(this,"You have watched Loki",Toast.LENGTH_SHORT).show();
        }
        if(strange.isChecked()) {
            Toast.makeText(this,"You have watched Dr. Strange",Toast.LENGTH_SHORT).show();
        }
        if(ant.isChecked()) {
            Toast.makeText(this,"You have watched Ant Man",Toast.LENGTH_SHORT).show();
        }
        loki.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this,"You have watched Loki",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"You need to watch Loki",Toast.LENGTH_SHORT).show();
                }
            }
        });
        strange.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this,"You have watched Dr. Strange",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"You need to watch Dr. Strange",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(MainActivity.this,"You have watched Ant Man",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"You need to watch Ant Man",Toast.LENGTH_SHORT).show();
                }
            }
        });









    }
}