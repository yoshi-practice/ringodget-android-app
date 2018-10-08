package com.ringodget.ringodget;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);    // タイトルバーを削除する
        setContentView(R.layout.activity_web);

        MyWebView view = findViewById(R.id.view);
        view.setWebViewClient(new WebViewClient());
        view.getSettings().setJavaScriptEnabled(true);    // JavaScriptを許可する
        view.loadUrl("https://ringodget.com");
    }
}
