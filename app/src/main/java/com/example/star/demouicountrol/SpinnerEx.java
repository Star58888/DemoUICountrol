package com.example.star.demouicountrol;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerEx extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_ex);
        spinner = (Spinner) findViewById(R.id.spinner);
        setSpinner(spinner);
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.spinner_menu , menu);
            MenuItem item = menu.findItem(R.id.actionbar_spinner);
            Spinner ab_spinner = (Spinner) MenuItemCompat.getActionView(item);
            setSpinner(ab_spinner);
            return super.onCreateOptionsMenu(menu);
        }
        void setSpinner(Spinner spinner) {
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.cards, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(SpinnerEx.this, "第" +(position +1) + "項" , Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
