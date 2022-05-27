package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Karnataka extends AppCompatActivity {
    Button button,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);
        button=findViewById(R.id.backkarnatakamainbutton);
        top=findViewById(R.id.karnatopbutton);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kar=new Intent(Karnataka.this,Karnataka_seven.class);
                startActivity(kar);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(Karnataka.this,MainPage.class);
                Toast.makeText(Karnataka.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(aback);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}