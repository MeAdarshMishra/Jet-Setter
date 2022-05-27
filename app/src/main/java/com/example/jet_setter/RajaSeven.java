package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RajaSeven extends AppCompatActivity {
    Button back,mountmap,bikanermap,pushkarmap,jodhpurmap,jaipurmap,rajatrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raja_seven);
        back=findViewById(R.id.rajasevenback);
        mountmap=findViewById(R.id.Mounthomapbutton);
        bikanermap=findViewById(R.id.Bikanermapbutton);
        pushkarmap=findViewById(R.id.Pushkarmapbutton);
        jodhpurmap=findViewById(R.id.Jodhpurmapbutton);
        jaipurmap=findViewById(R.id.Jaipurmapbutton);
        rajatrip=findViewById(R.id.Rajatripbutton);
        rajatrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/rajasthan");
            }
        });
        jaipurmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Jaipur,+Rajasthan/@26.8851417,75.6504715,11z/data=!3m1!4b1!4m5!3m4!1s0x396c4adf4c57e281:0xce1c63a0cf22e09!8m2!3d26.9124336!4d75.7872709");
            }
        });
        jodhpurmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Jodhpur,+Rajasthan/@26.2703424,72.9605027,12z/data=!3m1!4b1!4m5!3m4!1s0x39418c4eaa06ccb9:0x8114ea5b0ae1abb8!8m2!3d26.2389469!4d73.0243094");
            }
        });
        pushkarmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Pushkar,+Rajasthan/@26.4866491,74.5288578,14z/data=!3m1!4b1!4m5!3m4!1s0x396bdd22e5572a2f:0xb8733d912fcdf2ea!8m2!3d26.4885822!4d74.5509422");
            }
        });
        bikanermap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Bikaner,+Rajasthan/@28.0214035,73.284521,13z/data=!3m1!4b1!4m5!3m4!1s0x393fdd7bd90bbb89:0x4ce3121a7664816b!8m2!3d28.0229348!4d73.3119159");
            }
        });
        mountmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Mount+Abu,+Rajasthan+307501/@24.5932879,72.703257,14z/data=!3m1!4b1!4m5!3m4!1s0x395d2a7b9c58c24f:0x41ec48d89a772ec9!8m2!3d24.5925909!4d72.7156274");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rajaback=new Intent(RajaSeven.this,Rajasthan.class);
                startActivity(rajaback);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}