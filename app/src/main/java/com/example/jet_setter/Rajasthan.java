package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Rajasthan extends AppCompatActivity {
    Button button,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);
        button=findViewById(R.id.rajamainbackbutton);
        top=findViewById(R.id.rajatopbutton);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rajatop=new Intent(Rajasthan.this,RajaSeven.class);
                startActivity(rajatop);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Rajasthan.this,MainPage.class);
                Toast.makeText(Rajasthan.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }
}