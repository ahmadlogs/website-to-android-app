package com.example.ahmadlogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView MyWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyWebView = (WebView)findViewById(R.id.WebView);

        WebSettings webSettings = MyWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        MyWebView.loadUrl("https://amazon.com");

        MyWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed(){
        if(MyWebView.canGoBack()) {
            MyWebView.goBack();
        } else
        {
            super.onBackPressed();
        }
    }
}