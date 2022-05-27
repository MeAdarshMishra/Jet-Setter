package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Madhya_Pradesh extends AppCompatActivity {
    Button button,mptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh);
        button=findViewById(R.id.mpmainbackbutton);
        mptop=findViewById(R.id.mptopbutton);
        mptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent top=new Intent(Madhya_Pradesh.this,MPSeven.class);
                startActivity(top);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Madhya_Pradesh.this,MainPage.class);
                Toast.makeText(Madhya_Pradesh.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}