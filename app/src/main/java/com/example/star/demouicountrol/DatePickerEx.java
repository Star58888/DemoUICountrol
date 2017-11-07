package com.example.star.demouicountrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DatePickerEx extends AppCompatActivity {

    DatePicker datePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepickerex);
        datePicker = (DatePicker)findViewById(R.id.datePicker);
        Calendar calender = Calendar.getInstance();
        datePicker.init(calender.get(calender.YEAR) , calender.get(calender.MONTH) , calender.get(calender.DAY_OF_MONTH)
                                                                                        , onDateChangedListener);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = datePicker.getYear();
                int month = datePicker.getMonth() + 1;
                int day = datePicker.getDayOfMonth();
                Toast.makeText(DatePickerEx.this , "您選擇的日期" + year +"/" + month + "/" + day , Toast.LENGTH_SHORT).show();

            }
        });
    }

    DatePicker.OnDateChangedListener onDateChangedListener = new DatePicker.OnDateChangedListener() {
        @Override
        public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
            Toast.makeText(DatePickerEx.this , "您選擇的日期" + year +"/" + (month + 1)  + "/" + dayOfMonth , Toast.LENGTH_SHORT).show();
        }
    };
}
