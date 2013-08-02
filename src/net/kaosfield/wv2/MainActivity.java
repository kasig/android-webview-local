package net.kaosfield.wv2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.webView1);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

        wv.setWebChromeClient(new WebChromeClient());

        wv.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
