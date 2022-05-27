package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Andhra_Pradesh extends AppCompatActivity {
    Button button,aptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andhra_pradesh);
        button=findViewById(R.id.backandhrabutton);
        aptop=findViewById(R.id.aptopsbutton);
        aptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Andhra_Pradesh.this,AP_Visakhapatnam.class);
                Toast.makeText(Andhra_Pradesh.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Andhra_Pradesh.this,MainPage.class);
                Toast.makeText(Andhra_Pradesh.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}