package com.example.qthjen.projectneon;

import android.content.Intent;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.eightbitlab.supportrenderscriptblur.SupportRenderScriptBlur;

import eightbitlab.com.blurview.BlurView;

public class MainActivity extends AppCompatActivity {

    ViewGroup content;
    BlurView blurActionBar;
    BlurView blurButton1, blurButton2;

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = (ViewGroup) findViewById(R.id.content);
        blurActionBar = (BlurView) findViewById(R.id.blurActionBar);
        blurButton1 = (BlurView) findViewById(R.id.blurButton1);
        blurButton2 = (BlurView) findViewById(R.id.blurButton2);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);

        settupBlurView();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityTwo.class));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    public void settupBlurView() {

        float radius = 15;

        Drawable windowBackground = getWindow().getDecorView().getBackground();

        blurActionBar.setupWith(content)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(this))
                .blurRadius(radius);

        blurButton1.setupWith(content)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(this))
                .blurRadius(radius);

        blurButton2.setupWith(content)
                .windowBackground(windowBackground)
                .blurAlgorithm(new SupportRenderScriptBlur(this))
                .blurRadius(radius);

    }

}
