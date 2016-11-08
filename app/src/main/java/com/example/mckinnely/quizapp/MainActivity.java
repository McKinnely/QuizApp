package com.example.mckinnely.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int scoreTotal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void getAnswerOne()
    {
        String answerOne;
        TextView inputTextView = (TextView) findViewById(R.id.q1_answer);
        answerOne = inputTextView.getText().toString();
        if(answerOne.equals( "45"))
        {
            scoreTotal +=  25;
        }
    }


    public void getAnswerTwo()
    {
        CheckBox firstQ_CB = (CheckBox) findViewById(R.id.question_two_first_cb);
        CheckBox thirdQ_CB = (CheckBox) findViewById(R.id.question_two_third_cb);
        CheckBox fourthQ_CB = (CheckBox) findViewById(R.id.question_two_fourth_cb);
        boolean firstQ_CBChecked = firstQ_CB.isChecked();
        boolean thirdQ_CBChecked = thirdQ_CB.isChecked();
        boolean fourthQ_CBChecked = fourthQ_CB.isChecked();

        if(firstQ_CBChecked && thirdQ_CBChecked && fourthQ_CBChecked)
        {
            scoreTotal += 25;
        }
    }

    public void getAnswerThree()
    {
        RadioButton radQ1_RB = (RadioButton) findViewById(R.id.radio_question_one);
        boolean radQ1_RBChecked = radQ1_RB.isChecked();

        if(radQ1_RBChecked)
        {
            scoreTotal += 25;
        }
    }


    public void getAnswerFour()
    {
        RadioButton radQ2_RB = (RadioButton) findViewById(R.id.radio_question_four4);
        boolean radQ2_RBChecked = radQ2_RB.isChecked();

        if(radQ2_RBChecked)
        {
            scoreTotal += 25;
        }
    }

    public void getScore(View view)
    {
       getAnswerOne();
       getAnswerTwo();
       getAnswerThree();
       getAnswerFour();
       displayScore();
    }

    /**
     * Displays the given push up amount for incline push ups.
     */
    public void displayScore()
    {
        TextView scoreView = (TextView) findViewById(R.id.score_text);
        scoreView.setText(String.valueOf("Score: " + scoreTotal));
    }

}