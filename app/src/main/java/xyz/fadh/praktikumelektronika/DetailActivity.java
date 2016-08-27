package xyz.fadh.praktikumelektronika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DetailActivity extends AppCompatActivity {
    private Toolbar toolbar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int noModule = getIntent().getIntExtra("module", 0) + 1;
        String nameModule = getIntent().getStringExtra("name");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Modul " + noModule +" " + nameModule);
        setSupportActionBar(toolbar);

        webView = (WebView) findViewById(R.id.wvContent);
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(false);
        webSettings.setJavaScriptEnabled(false);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/modul1/modul1.html");
    }
}
