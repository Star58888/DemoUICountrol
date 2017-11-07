package com.example.star.demouicountrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarEx extends AppCompatActivity {
    RatingBar ra1, ra2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar_ex);
        ra1 = (RatingBar)findViewById(R.id.ratingBar1);
        ra2 = (RatingBar)findViewById(R.id.ratingBar2);
        ra2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(RatingBarEx.this , "你的分數是 : " + rating , Toast.LENGTH_LONG).show();
            }
        });

    }
}
