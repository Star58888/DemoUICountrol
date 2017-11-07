package com.example.star.demouicountrol;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressBarEx extends AppCompatActivity {

    ProgressBar progressBar;
    TextView tvPercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar_ex);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        tvPercent = (TextView)findViewById(R.id.percent);
        progressBar.setProgress(80);

        new MyAsyncTask().execute("開始下載");
    }
    private class MyAsyncTask extends AsyncTask<String , Integer , String> {

        @Override
        protected String doInBackground(String... params) {
            if(params[0].equals("開始下載"))
                for (int i = 0 ; i <= 100 ; i++) {
                    try {
                        Thread.sleep(100);
                        publishProgress(i);
//                    tvPercent.setText(i + "%");

                    } catch (InterruptedException e ) {
                        e.printStackTrace();
                    }
                }
            return  "下載完畢";
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            tvPercent.setText(values[0] + "%" );
            progressBar.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Toast.makeText(ProgressBarEx.this , result , Toast.LENGTH_LONG).show();
        }
    }
}