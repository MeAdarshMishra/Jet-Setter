package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tamil_Nadu extends AppCompatActivity {
    Button button,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu);
        button=findViewById(R.id.tamilnadumainbackbutton);
        top=findViewById(R.id.tamiltopbutton);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seven=new Intent(Tamil_Nadu.this,Tamil_Seven.class);
                startActivity(seven);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Tamil_Nadu.this,MainPage.class);
                Toast.makeText(Tamil_Nadu.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}