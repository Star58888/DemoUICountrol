package com.example.star.demouicountrol;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditTextEx extends AppCompatActivity {

    private static final String PREF_FILE = "settings";
    private EditText etAccount;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_ex);
        findViews();
        restore();

            }

            private void findViews() {
                etAccount = (EditText) findViewById(R.id.account_edit);
                etPassword = (EditText) findViewById(R.id.password_edit);
            }

            private void restore() {
                SharedPreferences settings = getSharedPreferences(PREF_FILE, 0);
                String person = settings.getString("etAccount", "");
                String password = settings.getString("etPassword", "");
                if (!person.equals(""))
                    etAccount.setText(person);

                if (!password.equals(""))
                    etPassword.setText(password);
            }
                @Override
                protected void onPause () {
                    super.onPause();
                    SharedPreferences settings = getSharedPreferences(PREF_FILE, 0);
                    settings.edit().putString("etAccount", etAccount.getText().toString()).commit();
                    settings.edit().putString("etPassword", etPassword.getText().toString()).commit();
                }

            }

