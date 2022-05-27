package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Karnataka_seven extends AppCompatActivity {
    Button back,bangloremap,mysoremap,mangloremap,bijapurmap,gokarnamap,karnatakatrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka_seven);
        back=findViewById(R.id.karsevenback);
        bangloremap=findViewById(R.id.Bangloremapbutton);
        mysoremap=findViewById(R.id.Mysoremapbutton);
        mangloremap=findViewById(R.id.Mangaloremapbutton);
        bijapurmap=findViewById(R.id.Bijapurmapbutton);
        gokarnamap=findViewById(R.id.Gokarnamapbutton);
        karnatakatrip=findViewById(R.id.Karnatakatripbutton);
        karnatakatrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/karnataka");
            }
        });
        gokarnamap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Gokarna,+Karnataka/@14.5372468,74.3066309,14z/data=!3m1!4b1!4m5!3m4!1s0x3bbe83d65b0a4c71:0xe9e09fd076bb41c0!8m2!3d14.5478586!4d74.318841");
            }
        });
        bijapurmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Vijayapura,+Karnataka/@16.8297983,75.6825178,13z/data=!3m1!4b1!4m5!3m4!1s0x3bc6557d98aa706f:0xedd4a1794e8fe8d2!8m2!3d16.8301708!4d75.710031");
            }
        });
        mangloremap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Mangaluru,+Karnataka/@12.9229829,74.7820228,12z/data=!3m1!4b1!4m5!3m4!1s0x3ba35a4c37bf488f:0x827bbc7a74fcfe64!8m2!3d12.9141417!4d74.8559568");
            }
        });
        mysoremap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Mysuru,+Karnataka/@12.3106368,76.565649,12z/data=!3m1!4b1!4m5!3m4!1s0x3baf70381d572ef9:0x2b89ece8c0f8396d!8m2!3d12.2958104!4d76.6393805");
            }
        });
        bangloremap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Bengaluru,+Karnataka/@12.95396,77.4908521,11z/data=!3m1!4b1!4m5!3m4!1s0x3bae1670c9b44e6d:0xf8dfc3e8517e4fe0!8m2!3d12.9715987!4d77.5945627");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karback=new Intent(Karnataka_seven.this,Karnataka.class);
                startActivity(karback);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}