package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MPSeven extends AppCompatActivity {
    Button back,khajurahomap,bandhavgarhmap,kanhamap,gwallormap,orchhamap,mptrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpseven);
        back=findViewById(R.id.mpsevenback);
        khajurahomap=findViewById(R.id.Khajurahomapbutton);
        bandhavgarhmap=findViewById(R.id.Bangloremapbutton);
        kanhamap=findViewById(R.id.Kanhamapbutton);
        gwallormap=findViewById(R.id.Gwaliormapbutton);
        orchhamap=findViewById(R.id.Orchhamapbutton);
        mptrip=findViewById(R.id.MPtripbutton);
        mptrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/madhya-pradesh");
            }
        });
        orchhamap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Orchha,+Madhya+Pradesh+472246/@25.3691158,78.5928805,13z/data=!3m1!4b1!4m5!3m4!1s0x3977785bf0359717:0xeab7a0fa33593940!8m2!3d25.3682704!4d78.6285252");
            }
        });
        gwallormap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Gwalior,+Madhya+Pradesh/@26.214088,78.0508125,11z/data=!3m1!4b1!4m5!3m4!1s0x3976c5d1792291fb:0xff4fb56d65bc3adf!8m2!3d26.2124007!4d78.1772053");
            }
        });
        kanhamap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Kanha,+Madhya+Pradesh+481111/@22.282862,80.6162488,17z/data=!3m1!4b1!4m5!3m4!1s0x3a2a08968d83563d:0xfb41d7019de9dd66!8m2!3d22.2815606!4d80.6181218");
            }
        });
        bandhavgarhmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Bandhavgarh/@23.7223389,81.0251893,17z/data=!3m1!4b1!4m5!3m4!1s0x3986a5ebec201667:0x7d241b1698c0e7cd!8m2!3d23.722339!4d81.029674");
            }
        });
        khajurahomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Khajuraho,+Madhya+Pradesh+471606/@24.8299603,79.8768061,13z/data=!3m1!4b1!4m5!3m4!1s0x3982e5f63138c3c5:0xaa20ea639a4572c!8m2!3d24.8318452!4d79.9198549");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(MPSeven.this,Madhya_Pradesh.class);
                startActivity(back);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}