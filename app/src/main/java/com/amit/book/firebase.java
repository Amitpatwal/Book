package com.amit.book;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


import java.util.Objects;

public class firebase extends AppCompatActivity {


Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
       button=findViewById(R.id.startHere);

        //Initialize ConnectivityManager
        ConnectivityManager connectivityManager = (ConnectivityManager)
                getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        //Get active netwrok info

        assert connectivityManager != null;
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        //Check network status

        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()) {


            Dialog dialog = new Dialog(this);

            //set content view
            dialog.setContentView(R.layout.alret_dailog);

            //set Outside touch

            dialog.setCanceledOnTouchOutside(false);

            //Set dialog width and height
            Objects.requireNonNull(dialog.getWindow()).setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);


            //set transparent background

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            //set animation


            //  dialog.getWindow().getAttributes().windowAnimations=android.R.style.Animation_Dialog;

            //inititialize dialoge Variale


            Button bt = dialog.findViewById(R.id.try_again);

            //Perform Onclick Listner
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //call recreate methode
                    finish();
                    recreate();

                }
            });

            //show dialog

            dialog.show();


        }

    }

    public void startHere(View view) {
        Intent i=new Intent(firebase.this,MainActivity.class);
        startActivity(i);
    }
}