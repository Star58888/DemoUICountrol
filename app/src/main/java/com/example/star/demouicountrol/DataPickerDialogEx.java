package com.example.star.demouicountrol;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DataPickerDialogEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapickerdialog_ex);
        Calendar calender = Calendar.getInstance();
        DatePickerDialog dataPickerDialog = new DatePickerDialog(
                this ,
                listener ,
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH));
                dataPickerDialog.show();
    }
    DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
            Toast.makeText(DataPickerDialogEx.this , "您選擇的日期" + year +"/" + month + "/" + dayOfMonth , Toast.LENGTH_SHORT).show();
        }
    };
}
