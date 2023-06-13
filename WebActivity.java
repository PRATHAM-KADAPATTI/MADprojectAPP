package com.example.madprojectapp;

import static com.example.madprojectapp.R.id.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    private TextView report;

    Button close;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        report = findViewById(R.id.txt_report);

        report.setText(getIntent().getStringExtra("message6"));

        String s1 = report.getText().toString();

        close = findViewById(R.id.btn_close);
        webView = findViewById(webview);
        webView.loadUrl(s1);


        close.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v)
    {
        if(v.equals(close))
        {
            Intent it =  new Intent(this,activity_recipient_profile.class);
            startActivity(it);
        }

    }
}