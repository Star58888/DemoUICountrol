package com.example.star.demouicountrol;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridViewEx extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview_ex);
        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

    }
    class ImageAdapter extends BaseAdapter {
        int[] imageResId = {
                R.drawable.img001,R.drawable.img002,R.drawable.img003,
                R.drawable.img004,R.drawable.img005,R.drawable.img006,
                R.drawable.img007,R.drawable.img008,R.drawable.img009,
                R.drawable.img010,R.drawable.img011,R.drawable.img012,
        };

        Context mCtx;

        ImageAdapter(Context context) {
            mCtx = context;
        }

        @Override
        public int getCount() {
            return imageResId.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imgView = new ImageView(mCtx);
            imgView.setLayoutParams(new ViewGroup.LayoutParams(150 , 150));
            imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imgView.setPadding(4 ,4 ,4 ,4);
            imgView.setImageResource(imageResId[i]);

            return imgView;
        }
    }
}
