package com.android.ashutosh_sadana.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int Q1_ANSWER = R.id.question_1_third_logo_radio;
    final int Q2_ANSWER = R.id.question_2_second_logo_radio;
    final String Q3_ANSWER = "taj mahal";
    final int Q4_ANSWER = R.id.question_4_first_logo_radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQuiz(View v) {
        ArrayList<String> incorrectAnswersList = new ArrayList<String>();

        int numberOfQuestionsCorrect = 0;

        if (checkQuestion1()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 1");
        }

        if (checkQuestion2()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 2");
        }

        if (checkQuestion3()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 3");
        }

        if (checkQuestion4()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 4");
        }

        if (checkQuestion5()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Question 5");
        }


        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswersList) {
            sb.append(s);
            sb.append("\n");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + numberOfQuestionsCorrect + "/5 answers right.\n\nRecheck the following:\n" + sb.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    private boolean checkQuestion1() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.question_1_radio_group);

        if( rg.getCheckedRadioButtonId() == Q1_ANSWER ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion2() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.question_2_radio_group);

        if( rg.getCheckedRadioButtonId() == Q2_ANSWER ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion3() {
        EditText et = (EditText)findViewById(R.id.question_3_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q3_ANSWER);
    }

    private boolean checkQuestion4() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.question_4_radio_group);

        if( rg.getCheckedRadioButtonId() == Q4_ANSWER ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion5() {
        CheckBox c1 = (CheckBox) findViewById(R.id.question_5_first_checkbox);
        CheckBox c2 = (CheckBox) findViewById(R.id.question_5_second_checkbox);
        CheckBox c3 = (CheckBox) findViewById(R.id.question_5_third_checkbox);

        if (c1.isChecked() && c3.isChecked() && !c2.isChecked()) {
            return true;
        }

        return false;
    }

}
