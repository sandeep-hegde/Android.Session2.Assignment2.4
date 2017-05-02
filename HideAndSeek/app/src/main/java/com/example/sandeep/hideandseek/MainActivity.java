//Android Developer Training Session 2 - Assignment 2.4

/*PROBLEM STATEMENT - Implement the hide and seek app.
It should consist of one TextView holding an image and one button titled "Hide/Show".
Use the button to toggle the value from hide to show and from show to hide. */

package com.example.sandeep.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mainImage;
    Button mButtonHide, mButtonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImage = (ImageView) findViewById(R.id.mainImage);
        mButtonHide = (Button) findViewById(R.id.hideBtn);
        mButtonShow = (Button) findViewById(R.id.showBtn);


        //Hides Image
        mButtonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonShow.setVisibility(View.VISIBLE);
                mainImage.setVisibility(View.INVISIBLE);
                mButtonHide.setVisibility(View.INVISIBLE);
            }
        });

        //Shows Image
        mButtonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButtonHide.setVisibility(View.VISIBLE);
                mainImage.setVisibility(View.VISIBLE);
                mButtonShow.setVisibility(View.INVISIBLE);

            }
        });

    }
}
