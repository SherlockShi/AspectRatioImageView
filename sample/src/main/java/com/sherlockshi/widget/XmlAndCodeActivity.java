package com.sherlockshi.widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sherlockshi.widget.aspectratioimageview.R;

/**
 * Author: SherlockShi
 * Date:   2016-10-01 09:33
 * Description:
 */

public class XmlAndCodeActivity extends AppCompatActivity {

    private AspectRatioImageView arivWallpaper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_xml_and_code);

        arivWallpaper = (AspectRatioImageView) findViewById(R.id.ariv_wallpaper);

        arivWallpaper.setWidthRatio(4);
        arivWallpaper.setHeightRatio(1);
    }
}
