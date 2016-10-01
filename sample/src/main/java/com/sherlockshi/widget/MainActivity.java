package com.sherlockshi.widget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sherlockshi.widget.aspectratioimageview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToXmlActivity(View view) {
        startActivity(new Intent(MainActivity.this, XmlActivity.class));
    }

    public void jumpToXmlAndCodeActivity(View view) {
        startActivity(new Intent(MainActivity.this, XmlAndCodeActivity.class));
    }
}
