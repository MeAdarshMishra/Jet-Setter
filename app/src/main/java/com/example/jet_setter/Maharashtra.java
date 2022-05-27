package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Maharashtra extends AppCompatActivity {
    Button button,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);
        button=findViewById(R.id.mahamainbackbutton);
        back=findViewById(R.id.mahatopbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mahaseven=new Intent(Maharashtra.this,MumbaiSeven.class);
                Toast.makeText(Maharashtra.this,"Top Places!",Toast.LENGTH_SHORT).show();
                startActivity(mahaseven);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Maharashtra.this,MainPage.class);
                Toast.makeText(Maharashtra.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}