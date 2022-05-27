package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Uttar_Pradesh extends AppCompatActivity {
    Button button,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar_pradesh);
        button=findViewById(R.id.backupmainbackbutton);
        top=findViewById(R.id.uptopbutton);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uptop=new Intent(Uttar_Pradesh.this,UP_Seven.class);
                startActivity(uptop);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Uttar_Pradesh.this,MainPage.class);
                Toast.makeText(Uttar_Pradesh.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}