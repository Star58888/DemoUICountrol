package com.example.star.demouicountrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheckBoxEx extends AppCompatActivity {
    CheckBox cbk11 , cbk12 , cbk13 , cbk21 , cbk22 , cbk23;
    Button submit;
    CheckBox[] checkBoxes;
    boolean[] isCheckedArray;
    TextView result1 , result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        findViews();
        setListener();
        }

    private void findViews() {
        cbk11 = (CheckBox) findViewById(R.id.checkBox11);
        cbk12 = (CheckBox) findViewById(R.id.checkBox12);
        cbk13 = (CheckBox) findViewById(R.id.checkBox13);
        cbk21 = (CheckBox) findViewById(R.id.checkBox21);
        cbk22 = (CheckBox) findViewById(R.id.checkBox22);
        cbk23 = (CheckBox) findViewById(R.id.checkBox23);
        checkBoxes = new CheckBox[]{cbk21 , cbk22 ,cbk23};
        isCheckedArray = new boolean[checkBoxes.length];
        submit = (Button)findViewById(R.id.submit);
        result1 = (TextView)findViewById(R.id.result);
        result2= (TextView)findViewById(R.id.result2);
    }
    private void setListener() {
        submit.setOnClickListener(btnListener);

        for (CheckBox cbk : checkBoxes) {
            cbk.setOnCheckedChangeListener(cbkListener);
        }
    }
        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "你喜歡的顏色是: \n " ;
                if(cbk11.isChecked())
                {
                    text += cbk11.getText() + " 、 ";
                }
                if(cbk12.isChecked())
                {
                    text += cbk12.getText() + " 、 ";
                }
                if(cbk13.isChecked())
                {
                    text += cbk13.getText() + " 、 ";
                }

                if(text.endsWith(" 、 "))
                {
                    result1.setText(text.substring(0 , text.length() - 1));
                }
                else
                {
                    result1.setText(text);
                }
            }
        };

        CheckBox.OnCheckedChangeListener cbkListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String text = "平常的休閒活動是 : \n";
                for (int i = 0; i < isCheckedArray.length; i++)
                {
                    isCheckedArray[i] = checkBoxes[i].isChecked();
                }
                for (int i = 0; i <isCheckedArray.length; i++)
                {
                    if(isCheckedArray[i])
                    {
                        text += checkBoxes[i].getText() + " 、 ";
                    }
                }
                if(text.endsWith(" 、 "))
                {
                    result2.setText(text.substring(0 , text.length() - 1));
                }
                else
                {
                    result2.setText(text);
                }
            }
        };
    }



//    CheckBox cg11 , cg12 , cg13 ,cg21 , cg22 , cg23;
//    Button submit;
//    TextView result , result2;
//    CheckBox[] checkBoxes;
//    boolean[] isCheckedArray;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_checkbox);
//        findViews();
//        setListeners();
//    }
//    private void findViews() {
//        cg11 = (CheckBox) findViewById(R.id.checkBox11);
//        cg12 = (CheckBox) findViewById(R.id.checkBox12);
//        cg13 = (CheckBox) findViewById(R.id.checkBox13);
//        cg21 = (CheckBox) findViewById(R.id.checkBox21);
//        cg22 = (CheckBox) findViewById(R.id.checkBox22);
//        cg23 = (CheckBox) findViewById(R.id.checkBox23);
//        checkBoxes = new CheckBox[] {cg21 ,cg22 , cg23};
//        isCheckedArray = new boolean[checkBoxes.length];
//        submit = (Button) findViewById(R.id.submit);
//        result = (TextView) findViewById(R.id.result);
//        result2 = (TextView) findViewById(R.id.result2);
//    }
//    private void setListeners() {
//        submit.setOnClickListener(btnListener);
//
//        for(CheckBox cbk : checkBoxes)
//            cbk.setOnCheckedChangeListener(cbkListener);
//    }
//
//    View.OnClickListener btnListener = new View.OnClickListener() {
//
//        @Override
//        public void onClick(View v) {
//            String text = "您喜歡的顏色 : \n" ;
//
//            if(cg11.isChecked())
//                text += cg11.getText() + " , ";
//            if(cg12.isChecked())
//                text += cg12.getText() + " , ";
//            if(cg13.isChecked())
//                text += cg13.getText() + " , ";
//
//            if(text.endsWith(" ` "))
//                result.setText(text.substring(0 , text.length() - 1));
//            else
//                result.setText(text);
//
//
//        }
//    };
//
//    CheckBox.OnCheckedChangeListener cbkListener = new CheckBox.OnCheckedChangeListener() {
//
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//            String text = "平常的休閒活動 : \n" ;
//
////            for(int i = 0 ; i < checkBoxes.length; i++ )
////                checkBoxes.length = text[i];
//
//
////            if((buttonView == cg21) && isChecked && !text.contains(cg21.getText()))
////                text += cg21.getText() + " , ";
////            if((buttonView == cg22) && isChecked && !text.contains(cg22.getText()))
////                text += cg22.getText() + " , ";
////            if((buttonView == cg23) && isChecked && !text.contains(cg23.getText()))
////                text += cg23.getText() + " , ";
////
////
////            if(text.endsWith(" , "))
////                result2.setText(text.substring(0 , text.length() - 1));
////            else
////            result2.setText(text);
//        }
//
//    };
//}
