package com.amit.book;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class Weshow extends AppCompatActivity {
    //declaring variables
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weshow);



        //initilize webview
        webView=findViewById(R.id.webView);

        //passing the data
        Intent i=getIntent();
        String website=i.getStringExtra("links");

        //loading the webview
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(website);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new Weshow.myWebclient());
    }

    //Back pressed method
    @Override
    public void onBackPressed() {
        if (webView.canGoBack())

        {

            webView.goBack();
        }
        else{
            super.onBackPressed();

        }
    }

 //progress bar
    public class myWebclient extends WebViewClient {
        ProgressDialog pb = null;

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            pb = new ProgressDialog(Weshow.this);
            pb.setTitle("Please Wait..");
            pb.setMessage("Loading..");
            pb.show();
            pb.setCanceledOnTouchOutside(false);

                      super.onPageStarted(view, url, favicon);
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            pb.dismiss();
            super.onPageFinished(view, url);
        }
    }


}