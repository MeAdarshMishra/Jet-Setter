package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AP_Visakhapatnam extends AppCompatActivity {
    Button button,vmappbutton,vijaymapbutton,tirupatimap,nilloremap,chittoormap,puttapartimap,rajahumudrymap,vishakhapatnamtripbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap_visakhapatnam);
        button=findViewById(R.id.apvisakhaback);
        vmappbutton=findViewById(R.id.vishakhapatnambutton);
        vijaymapbutton=findViewById(R.id.vijaymapbutton);
        tirupatimap=findViewById(R.id.Tirupatimapbutton);
        nilloremap=findViewById(R.id.Nelloremapbutton);
        chittoormap=findViewById(R.id.Chittoremapbutton);
        puttapartimap=findViewById(R.id.Puttaparimapbutton);
        vishakhapatnamtripbutton=findViewById(R.id.Vishakhapatnamtripbutton);
        rajahumudrymap=findViewById(R.id.Rajahumudarymapbutton);
        vishakhapatnamtripbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/andhra-pradesh");
            }
        });
        rajahumudrymap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Puttaparthi,+Andhra+Pradesh/@14.1609165,77.7540844,13z/data=!3m1!4b1!4m5!3m4!1s0x3bb165280bafd0e3:0x90a173d37e29cfb!8m2!3d14.1669963!4d77.8091496");
            }
        });
        puttapartimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Puttaparthi,+Andhra+Pradesh/@14.1609184,77.7715944,14z/data=!3m1!4b1!4m5!3m4!1s0x3bb165280bafd0e3:0x90a173d37e29cfb!8m2!3d14.1669963!4d77.8091496");
            }
        });
        chittoormap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Chittoor,+Andhra+Pradesh/@13.2163642,79.0888042,14z/data=!3m1!4b1!4m5!3m4!1s0x3bad5c1a6cca26a1:0xaaadf018b7f72797!8m2!3d13.217176!4d79.1003289");
            }
        });
        nilloremap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Nellore,+Andhra+Pradesh/@14.4289573,79.9456851,13z/data=!3m1!4b1!4m5!3m4!1s0x3a4c8cca0e958771:0xd3036c2025161f55!8m2!3d14.4425987!4d79.986456");
            }
        });
        tirupatimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Tirupati,+Andhra+Pradesh/@13.6276426,79.3547601,12z/data=!3m1!4b1!4m5!3m4!1s0x3a4d4b0f88620427:0xcf4152d1daca0cac!8m2!3d13.6287557!4d79.4191795");
            }
        });
        vijaymapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Vijayawada,+Andhra+Pradesh/@16.5101619,80.6098647,13z/data=!3m1!4b1!4m5!3m4!1s0x3a35eff9482d944b:0x939b7e84ab4a0265!8m2!3d16.5061743!4d80.6480153");

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(AP_Visakhapatnam.this,Andhra_Pradesh.class);
                startActivity(back);
                finish();
            }
        });
        vmappbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Visakhapatnam,+Andhra+Pradesh/@17.7386225,83.1225041,11z/data=!3m1!4b1!4m5!3m4!1s0x3a39431389e6973f:0x92d9c20395498468!8m2!3d17.6868159!4d83.2184815");
            }
        });

    }

    private void gotourl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}