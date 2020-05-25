package com.example.intent0525_u1065206;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);

        switch (view.getId()){
            case R.id.btnEmail:
                intent.setData(Uri.parse("mailto:u10155566@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"好久不見");
                intent.putExtra(Intent.EXTRA_TEXT,"你好嗎?87");
                break;

            case R.id.btnWeb:
                intent.setData(Uri.parse("http://www.csim.hk.edu.tw/main.php"));
                break;

            case R.id.btnMap:
                intent.setData(Uri.parse("https://reurl.cc/D9xRp6"));
                break;
            case R.id.btnWebSearch:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"弘光科技大學");
                break;
        }
        startActivity(intent);
    }
}
