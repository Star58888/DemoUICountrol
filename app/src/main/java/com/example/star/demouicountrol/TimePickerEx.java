package com.example.star.demouicountrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerEx extends AppCompatActivity {

    TimePicker timePicker;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepickerex);
        timePicker = (TimePicker)findViewById(R.id.timePicker);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                Toast.makeText(TimePickerEx.this , "您設定的時間 : " + hour + ":" + minute , Toast.LENGTH_LONG).show();
            }
        });
    }
}
