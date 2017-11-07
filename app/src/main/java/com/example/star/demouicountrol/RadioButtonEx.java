package com.example.star.demouicountrol;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonEx extends AppCompatActivity {

    RadioGroup rg1 , rg2 , rg3;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        findViews();
        setListeners();
    }
    private void findViews() {
        rg1 = (RadioGroup)findViewById(R.id.radioGroup);
        rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
        rg3 = (RadioGroup)findViewById(R.id.radioGroup3);
        submit = (Button)findViewById(R.id.submit);
        result = (TextView)findViewById(R.id.result);
    }
    private void setListeners() {
        submit.setOnClickListener(btnListener);
        rg1.setOnCheckedChangeListener(rgListener);
        rg2.setOnCheckedChangeListener(rgListener);
        rg3.setOnCheckedChangeListener(rgListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            RadioButton rBtn = (RadioButton)findViewById(rg1.getCheckedRadioButtonId());

            RadioButton rBtn2 = (RadioButton)findViewById(rg2.getCheckedRadioButtonId());

            RadioButton rBtn3 = (RadioButton)findViewById(rg3.getCheckedRadioButtonId());

            String text = "您對此次用餐感到 : "  + rBtn.getText() + "\n"  + "您的性別是 : " + rBtn2.getText()  + "\n" +
            "您的年齡是 : " + rBtn3.getText() ;
            result.setText(text);

        }
    };
    RadioGroup.OnCheckedChangeListener rgListener = new RadioGroup.OnCheckedChangeListener() {  // 讀取使用者操作

        @Override
        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
            int resId = group.getId();
            String groupName = getResources().getResourceEntryName(resId);
            String itemName = getResources().getResourceEntryName(checkedId);
            RadioButton rBtn = (RadioButton)findViewById(checkedId);
            RadioButton rBtn2 = (RadioButton)findViewById(checkedId);
            RadioButton rBtn3 = (RadioButton)findViewById(checkedId);
            String text = "";
            switch(resId) {
                case R.id.radioGroup:
                    text = "您對此次用餐感到 : "  + rBtn.getText() + "\n";
                    break;
                case R.id.radioGroup2:
                    text = "您的性別是 : " + rBtn2.getText()  + "\n";
                    break;
                case R.id.radioGroup3:
                    text = "您的年齡是 : " + rBtn3.getText() ;
                    Toast.makeText(RadioButtonEx.this , groupName + " : " + itemName
                            , Toast.LENGTH_LONG).show();
                    break;
            }
            result.setText(text);
        }
    };
}
