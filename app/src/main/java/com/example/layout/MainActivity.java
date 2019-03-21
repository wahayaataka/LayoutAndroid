package com.example.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

        RelativeLayout rellay_hotel,rellay_plane,rellay_car,rellay_info, rellay_pasport, rellay_review,rellay_stuff,rellay_vila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_hotel = findViewById(R.id.rellay_hotel);
        rellay_plane = findViewById(R.id.rellay_plane);
        rellay_car = findViewById(R.id.rellay_car);
        rellay_info = findViewById(R.id.rellay_info);
        rellay_pasport = findViewById(R.id.rellay_pasport);
        rellay_review = findViewById(R.id.rellay_review);
        rellay_stuff = findViewById(R.id.rellay_stuff);
        rellay_vila = findViewById(R.id.rellay_vila);

        rellay_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hotel.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hotel.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hotel.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        rellay_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hotel.class );
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
