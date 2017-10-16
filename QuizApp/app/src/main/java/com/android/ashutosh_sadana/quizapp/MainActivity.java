package com.android.ashutosh_sadana.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    final int ANS_1 = R.id.ques1_radio3;
    final int ANS_2 = R.id.ques2_radio2;
    final String ANS_3 = "taj mahal";
    final int ANS_4 = R.id.ques4_radio1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View v) {


        int correctAnswers = 0;
        int incorrectAnswers = 0;

        RadioGroup rg = (RadioGroup) findViewById(R.id.ques1_radio_grp);
        if( rg.getCheckedRadioButtonId() == ANS_1 ) {
            correctAnswers++;
        } else{
            incorrectAnswers++;
        }



        RadioGroup rg2 = (RadioGroup) findViewById(R.id.ques2_radio_grp);

        if( rg2.getCheckedRadioButtonId() == ANS_2 ) {
            correctAnswers++;
        } else{
            incorrectAnswers++;
        }

        EditText et = (EditText)findViewById(R.id.ques3_edit_text);
        if (et.getText().toString().trim().equalsIgnoreCase(ANS_3)) {
            correctAnswers++;
        } else{
            incorrectAnswers++;
        }

        RadioGroup rg4 = (RadioGroup) findViewById(R.id.ques_4_radio_grp);

        if( rg4.getCheckedRadioButtonId() == ANS_4) {
            correctAnswers++;
        } else{
            incorrectAnswers++;
        }

        CheckBox c1 = (CheckBox) findViewById(R.id.ques5_checkbox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.ques5_checkbox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.ques5_checkbox3);
        if (c1.isChecked() && c3.isChecked() && !c2.isChecked()) {
            correctAnswers++;
        } else{
            incorrectAnswers++;
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + correctAnswers + "/5 answers right.\nYou got " + incorrectAnswers +"/5 answers wrong.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}
