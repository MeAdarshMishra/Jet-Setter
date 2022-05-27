package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UP_Seven extends AppCompatActivity {
    Button back,varanasimap,lucknowmap,agramap,vrindavanmap,ayodhyamap,uptrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_seven);
        back=findViewById(R.id.upsevenback);
        varanasimap=findViewById(R.id.Varanasimapbutton);
        lucknowmap=findViewById(R.id.Lucknowmapbutton);
        agramap=findViewById(R.id.Agramapbutton);
        vrindavanmap=findViewById(R.id.Vrindavanmapbutton);
        ayodhyamap=findViewById(R.id.Ayodhyamapbutton);
        uptrip=findViewById(R.id.UPtripbutton);
        uptrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/uttar-pradesh");
            }
        });
        ayodhyamap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Ayodhya,+Uttar+Pradesh/@26.7897741,82.1816582,14z/data=!3m1!4b1!4m5!3m4!1s0x399a07937e6d2823:0x5fc8f683b17f222b!8m2!3d26.7921605!4d82.1997954");
            }
        });
        vrindavanmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Vrindavan,+Uttar+Pradesh/@27.564811,77.6243513,13z/data=!3m1!4b1!4m5!3m4!1s0x39736fcb5e9a2309:0x9868374c5faaf3ce!8m2!3d27.5650088!4d77.6593394");
            }
        });
        agramap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Agra,+Uttar+Pradesh/@27.1761571,77.9099725,12z/data=!3m1!4b1!4m5!3m4!1s0x39740d857c2f41d9:0x784aef38a9523b42!8m2!3d27.1766701!4d78.0080745");
            }
        });
        lucknowmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Lucknow,+Uttar+Pradesh/@26.848623,80.8024264,11z/data=!3m1!4b1!4m5!3m4!1s0x399bfd991f32b16b:0x93ccba8909978be7!8m2!3d26.8466937!4d80.946166");
            }
        });
        varanasimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Varanasi,+Uttar+Pradesh/@25.3206931,82.8475768,12z/data=!3m1!4b1!4m5!3m4!1s0x398e2db76febcf4d:0x68131710853ff0b5!8m2!3d25.3176452!4d82.9739144");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upback=new Intent(UP_Seven.this,Uttar_Pradesh.class);
                startActivity(upback);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}