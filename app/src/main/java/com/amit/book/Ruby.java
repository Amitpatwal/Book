package com.amit.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ruby extends AppCompatActivity {


     ImageView i1, i2;
    String[] urls=new String[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruby);



        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);


        //puting image into string

        urls[0]="https://drive.google.com/open?id=0ByWO0aO1eI_Mb0RoVVpVajNlRGM";
        urls[1]="https://drive.google.com/open?id=0ByWO0aO1eI_MZ0M2T0JGZFdRWUE";


        // click event in image

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Weshow.class);
                i.putExtra("links",urls[0]);
                startActivity(i);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Weshow.class);
                i.putExtra("links",urls[1]);
                startActivity(i);
            }
        });
    }
}
