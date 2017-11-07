package com.example.star.demouicountrol;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    Class<?>[] activityClasses = {
            CheckBoxEx.class,
            DataPickerDialogEx.class,
            DatePickerEx.class,
            EditTextEx.class,
            GridViewEx.class,
            ListViewEx.class,
            ProgressBarEx.class,
            RadioButtonEx.class,
            RatingBarEx.class,
            SpinnerEx.class,
            TimePickerEx.class,
            ToggleButtonEx.class,
            };

    String[] getActivityNames () {
        String[] activityNames = new String[activityClasses.length];
        for (int i = 0; i < activityNames.length; i++) {
            activityNames[i] = activityClasses[i].getSimpleName();

        }
        return activityNames;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, getActivityNames());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, activityClasses[position]);
                startActivity(intent);
            }
        });
    }
}



///**
////自己的方法
//    String[] activityNames = {
//            "CheckBoxEx",
//            "DataPickerDialogEx",
//            "DatePickerEx",
//            "EditTextEx",
//            "ListViewEx",
//            "ProgressBarEx",
//            "RadioButtonEx",
//            "RatingBarEx",
//            "TimePickerEx",
//            "ToggleButtonEx",
//    };
//    class DemoInfo {
//        private final Class<?> demoClass;
//
//        DemoInfo(Class<?> demoClass) {
//            this.demoClass = demoClass;
//        }
//    }
//    DemoInfo[] activityClasses = {
//            new DemoInfo(CheckBoxEx.class),
//            new DemoInfo(DataPickerDialogEx.class),
//            new DemoInfo(DatePickerEx.class),
//            new DemoInfo(EditTextEx.class),
//            new DemoInfo(ListViewEx.class),
//            new DemoInfo(ProgressBarEx.class),
//            new DemoInfo(RadioButtonEx.class),
//            new DemoInfo(RatingBarEx.class),
//            new DemoInfo(TimePickerEx.class),
//            new DemoInfo(ToggleButtonEx.class)
//    };
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        listView = (ListView) findViewById(R.id.listView);
//        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, activityNames);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent = new Intent(MainActivity.this, activityClasses[position].demoClass);
//                startActivity(intent);
//            }
//        });
//    }
//}                                                                                                                           */