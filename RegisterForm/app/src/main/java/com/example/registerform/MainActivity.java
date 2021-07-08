package com.example.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RegButton(View v) {
        EditText editText=findViewById(R.id.name);
        EditText editText2=findViewById(R.id.surname);
        EditText editText3=findViewById(R.id.email);
        String n=editText.getText().toString();
        String s=editText2.getText().toString();
        String e=editText3.getText().toString();

        TextView editText4=findViewById(R.id.regName);
        TextView editText5=findViewById(R.id.regSurname);
        TextView editText6=findViewById(R.id.regEmail);
        editText4.setText("Name: "+n);
        editText5.setText("Surname: "+s);
        editText6.setText("Email: "+e);
    }
}