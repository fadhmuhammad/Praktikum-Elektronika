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
        switch (noModule){
            case 10 :
                getSupportActionBar().setTitle("Peraturan Praktikum");
                break;
            case 11 :
                getSupportActionBar().setTitle("Asisten Praktikum");
                break;
            case 12:
                getSupportActionBar().setTitle("Nilai Praktikum");
                break;
            default:
                getSupportActionBar().setTitle("Modul " + noModule);
        }

        webView = (WebView) findViewById(R.id.wvContent);
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(false);
        webSettings.setJavaScriptEnabled(false);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/"+noModule+".html");
    }
}
