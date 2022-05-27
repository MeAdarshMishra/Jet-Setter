package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MumbaiSeven extends AppCompatActivity {
    Button back,punemap,nashikmap,aurangabadmap,mahabaleshwarmap,matheranmap,mahatrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_seven);
        back=findViewById(R.id.mumsevenback);
        punemap=findViewById(R.id.Punemapbutton);
        nashikmap=findViewById(R.id.Nasikmapbutton);
        aurangabadmap=findViewById(R.id.Aunragabadmapbutton);
        mahabaleshwarmap=findViewById(R.id.Mahabaleshwarmapbutton);
        matheranmap=findViewById(R.id.Mathranmapbutton);
        mahatrip=findViewById(R.id.Maharastratripbutton);
        mahatrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/maharashtra");
            }
        });
        matheranmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Matheran,+Maharashtra/@18.9901998,73.2378864,13z/data=!3m1!4b1!4m5!3m4!1s0x3be7e5566af9569b:0x56bade96248a07e6!8m2!3d18.9886587!4d73.271179");
            }
        });
        mahabaleshwarmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Mahabaleshwar,+Maharashtra+412806/@17.9258213,73.6312721,14z/data=!3m1!4b1!4m5!3m4!1s0x3bc2655313cba1bb:0xca8196c7aa20a0a8!8m2!3d17.9307285!4d73.6477342");
            }
        });
        aurangabadmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Aurangabad,+Maharashtra/@19.8700826,75.2351608,12z/data=!3m1!4b1!4m5!3m4!1s0x3bdb9815a369bc63:0x712d538b29a2a73e!8m2!3d19.8761653!4d75.3433139");
            }
        });
        nashikmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Nashik,+Maharashtra/@19.9909493,73.7334402,12z/data=!3m1!4b1!4m5!3m4!1s0x3bddd290b09914b3:0xcb07845d9d28215c!8m2!3d19.9974533!4d73.7898023");
            }
        });
        punemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Pune,+Maharashtra/@18.5245649,73.7228803,11z/data=!3m1!4b1!4m5!3m4!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!8m2!3d18.5204303!4d73.8567437");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aback=new Intent(MumbaiSeven.this,Maharashtra.class);
                Toast.makeText(MumbaiSeven.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
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