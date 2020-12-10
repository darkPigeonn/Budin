package com.example.budinbudin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.budinbudin.saraf.sistem_saraf_menu;
import com.example.budinbudin.saraf.sistem_saraf_tepi.sistem_saraf_tepi;

public class VideoYoutube extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_youtube);


        webView = findViewById(R.id.webViewSaya);

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setDefaultFontSize(18);

        muatVideo();

        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VideoYoutube.this, sistem_saraf_menu.class));
                finish();
            }
        });

    }

    private void muatVideo() {
        String kodeHtml ="<head></head><body>"+
                "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FT44xI92LCU\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"+
                "</body>";
        webView.loadData(kodeHtml,"text/html; charset=utf-8", null);
    }
}