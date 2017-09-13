package com.example.qthjen.projectneon;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.eightbitlab.supportrenderscriptblur.SupportRenderScriptBlur;

import eightbitlab.com.blurview.BlurView;

public class ActivityTwo extends AppCompatActivity {

    ViewGroup activity2;
    BlurView blurActivity, blurActionbar2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        activity2 = (ViewGroup) findViewById(R.id.Activity2);
        blurActivity = (BlurView) findViewById(R.id.blurActivity);
        blurActionbar2 = (BlurView) findViewById(R.id.blurActionBar2);

        float radius = 15;

        Drawable windowBackground = getWindow().getDecorView().getBackground();

        blurActivity.setupWith(activity2)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(this))
                .blurRadius(radius);

        blurActionbar2.setupWith(activity2)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(this))
                .blurRadius(radius);

    }
}
