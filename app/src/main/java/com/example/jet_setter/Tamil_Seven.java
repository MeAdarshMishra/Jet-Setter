package com.example.jet_setter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tamil_Seven extends AppCompatActivity {
    Button back,chennaimap,mahabalipuram,kanyakumarimap,madhuraimap,kodaikanalmap,tamiltrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_seven);
        back=findViewById(R.id.tamilsevenback);
        chennaimap=findViewById(R.id.Chennaimapbutton);
        mahabalipuram=findViewById(R.id.Mahabalipurammapbutton);
        kanyakumarimap=findViewById(R.id.Kanyakumarimapbutton);
        madhuraimap=findViewById(R.id.Maduraimapbutton);
        kodaikanalmap=findViewById(R.id.Kodaikanalmapbutton);
        tamiltrip=findViewById(R.id.Tamiltripbutton);
        tamiltrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://traveltriangle.com/tour-packages/tamil-nadu");
            }
        });
        kodaikanalmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Kodaikanal,+Tamil+Nadu/@10.2351507,77.4793624,14z/data=!3m1!4b1!4m5!3m4!1s0x3b0766637f0a0387:0x9ffae9373758c13c!8m2!3d10.2381136!4d77.4891822");
            }
        });
        madhuraimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Madurai,+Tamil+Nadu/@9.9178296,78.0527829,12z/data=!3m1!4b1!4m5!3m4!1s0x3b00c582b1189633:0xdc955b7264f63933!8m2!3d9.9252007!4d78.1197754");
            }
        });
        kanyakumarimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Kanyakumari,+Tamil+Nadu/@8.0864019,77.5371157,15z/data=!3m1!4b1!4m5!3m4!1s0x3b04ed3d2a087861:0x1e790e896aeffaa0!8m2!3d8.0883064!4d77.5384507");
            }
        });
        mahabalipuram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Mahabalipuram,+Tamil+Nadu+603104/@12.6223265,80.1736327,14z/data=!3m1!4b1!4m5!3m4!1s0x3a5254aa30074dc5:0x9d00999d9ca8933f!8m2!3d12.6207821!4d80.1944915");
            }
        });
        chennaimap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.google.com/maps/place/Chennai,+Tamil+Nadu/@13.0473672,79.9218931,11z/data=!3m1!4b1!4m5!3m4!1s0x3a5265ea4f7d3361:0x6e61a70b6863d433!8m2!3d13.0826802!4d80.2707184");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karsback=new Intent(Tamil_Seven.this,Tamil_Nadu.class);
                Toast.makeText(Tamil_Seven.this,"Welcome Back!",Toast.LENGTH_SHORT).show();
                startActivity(karsback);
                finish();
            }
        });
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}