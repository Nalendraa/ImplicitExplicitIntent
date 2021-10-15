package com.example.browserlaunch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receivedIntent = getIntent();
        Uri uri = receivedIntent.getData();
        URL webUrl= null;

        if (uri != null) {
            try {
                webUrl = new URL(uri.getScheme(),uri.getHost(),uri.getPath());
            }
            catch (Exception e) {
                Toast.makeText(this, "Intent exception occured", Toast.LENGTH_SHORT).show();

            }

            WebView webView = (WebView) findViewById(R.id.webview);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(webUrl.toString());
        }
    }
}