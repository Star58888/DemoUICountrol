package com.example.star.demouicountrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewEx extends AppCompatActivity {

    ListView listView;
    String[] arrays = {"網路概論" , "通訊網路實驗" , "通訊概論" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_ex);


        listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this ,
                android.R.layout.simple_list_item_single_choice ,
                arrays);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);    // 呼叫RadioButton
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // simple_list_item_single_choic 型態為 CheckedTextView ;view 強制轉為CheckedTextView show出來
                Toast.makeText(ListViewEx.this , "第" + (position +1 ) + "項" + ((CheckedTextView)view).getText().toString() , Toast.LENGTH_SHORT).show();

            }
        });

    }
}
