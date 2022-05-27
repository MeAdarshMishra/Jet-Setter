package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {
    ImageButton andhrapradesh,uttarpradesh,karnataka,tamilnadu,madhyapradesh,maharastra,rajasthan;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        andhrapradesh =findViewById(R.id.andhrapradeshbutton);
        uttarpradesh=findViewById((R.id.uttarpradeshbutton));
        karnataka=findViewById((R.id.karanatakabutton));
        tamilnadu=findViewById((R.id.tamilnadubutton));
        madhyapradesh=findViewById((R.id.madhyapradeshbutton));
        maharastra=findViewById((R.id.maharastrabutton));
        rajasthan=findViewById((R.id.rajasthanbutton));
        button=findViewById(R.id.mainback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"Login Page",Toast.LENGTH_SHORT).show();
                Intent mainback=new Intent(MainPage.this,MainActivity.class);
                startActivity(mainback);
                finish();
            }
        });
        andhrapradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"The Essence of Incredible India!",Toast.LENGTH_SHORT).show();
                Intent andhra=new Intent(MainPage.this,Andhra_Pradesh.class);
                startActivity(andhra);
                finish();
            }
        });
        uttarpradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"Amazing Heritage Grand Experiences!",Toast.LENGTH_SHORT).show();
                Intent uttar=new Intent(MainPage.this,Uttar_Pradesh.class);
                startActivity(uttar);
                finish();
            }
        });
        karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"One state Many Worlds!",Toast.LENGTH_SHORT).show();
                Intent karna=new Intent(MainPage.this,Karnataka.class);
                startActivity(karna);
                finish();
            }
        });
        tamilnadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"Enchanting Tamil Nadu!",Toast.LENGTH_SHORT).show();
                Intent tamil=new Intent(MainPage.this,Tamil_Nadu.class);
                startActivity(tamil);
                finish();
            }
        });
        madhyapradesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"The Heart of Incredible India!",Toast.LENGTH_SHORT).show();
                Intent madhya=new Intent(MainPage.this,Madhya_Pradesh.class);
                startActivity(madhya);
                finish();
            }
        });
        maharastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"Maharashtra Unlimited!",Toast.LENGTH_SHORT).show();
                Intent maha=new Intent(MainPage.this,Maharashtra.class);
                startActivity(maha);
                finish();
            }
        });
        rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainPage.this,"Rajasthan The Incredible State of India!",Toast.LENGTH_SHORT).show();
                Intent raja=new Intent(MainPage.this,Rajasthan.class);
                startActivity(raja);
                finish();
            }
        });
    }
}