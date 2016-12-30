package com.example.dreamteam.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Pattern;

public class MainActivity extends Activity {
    Players[] playerList = new Players[2];

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variable IDENTIFICATION:
        // Get BUTTONS:
        final Button SingleScore_button = (Button)findViewById(R.id.SingleScore_button);
        final Button Redo_button = (Button)findViewById(R.id.button_Redo);
        final Button Reg_button = (Button)findViewById(R.id.ButtonRegister);
        final Button BUTTONQ1 = (Button)findViewById(R.id.ButtonQ1);
        final Button BUTTONQ2 = (Button)findViewById(R.id.ButtonQ2);
        final Button BUTTONQ3 = (Button)findViewById(R.id.ButtonQ3);
        final Button BUTTONQ4 = (Button)findViewById(R.id.ButtonQ4);
        final Button BUTTONQ5 = (Button)findViewById(R.id.ButtonQ5);
        final Button BUTTONA = (Button)findViewById(R.id.buttonA);
        final Button BUTTONB = (Button)findViewById(R.id.buttonB);
        final Button BUTTONC = (Button)findViewById(R.id.buttonC);
        final Button BUTTONSCORE = (Button)findViewById(R.id.buttonScore);
        final Button BUTTONSINGLE = (Button) findViewById(R.id.SingleButton);
        final Button BUTTONMULTI = (Button) findViewById(R.id.MultiplayerButton);
        final Button BUTTONSTART = (Button) findViewById(R.id.StartButton);
        final Button BUTTONSKIP = (Button) findViewById(R.id.SkipButton);
        final Button BUTTONHINT = (Button) findViewById(R.id.HintButton);
        final Button BUTTONNEXT = (Button) findViewById(R.id.NextPlayerButton);

        // Get EDIT TEXTS:
        final EditText txtname = (EditText) findViewById(R.id.NameEditText);

        // Get TEXT VIEWS:
        final TextView name_tit = (TextView) findViewById(R.id.TextViewNameTit);
        final TextView hello = (TextView) findViewById(R.id.TextViewWelcome);
        final TextView question_txt = (TextView)findViewById(R.id.QuestionTextView);
        final TextView sol_txt = (TextView)findViewById(R.id.textViewSolution);
        final TextView score_txt = (TextView)findViewById(R.id.textViewScore);
        final TextView low_txt = (TextView)findViewById(R.id.textViewLow);
        final TextView high_txt = (TextView)findViewById(R.id.textViewHigh);
        final TextView notice_txt = (TextView)findViewById(R.id.textViewNotice);

        // INITIAL VALUE SET
        Redo_button.setVisibility(View.INVISIBLE);
        notice_txt.setVisibility(View.INVISIBLE);
        BUTTONSCORE.setVisibility(View.INVISIBLE);
        BUTTONQ1.setVisibility(View.INVISIBLE);
        BUTTONQ2.setVisibility(View.INVISIBLE);
        BUTTONQ3.setVisibility(View.INVISIBLE);
        BUTTONQ4.setVisibility(View.INVISIBLE);
        BUTTONQ5.setVisibility(View.INVISIBLE);
        BUTTONA.setVisibility(View.INVISIBLE);
        BUTTONB.setVisibility(View.INVISIBLE);
        BUTTONC.setVisibility(View.INVISIBLE);
        question_txt.setVisibility(View.INVISIBLE);
        sol_txt.setVisibility(View.INVISIBLE);
        score_txt.setVisibility(View.INVISIBLE);
        BUTTONSTART.setVisibility(View.INVISIBLE);
        Reg_button.setVisibility(View.INVISIBLE);
        BUTTONNEXT.setVisibility(View.INVISIBLE);
        txtname.setVisibility(View.INVISIBLE);
        high_txt.setVisibility(View.INVISIBLE);
        low_txt.setVisibility(View.INVISIBLE);
        name_tit.setVisibility(View.INVISIBLE);
        BUTTONHINT.setVisibility(View.INVISIBLE);
        BUTTONSKIP.setVisibility(View.INVISIBLE);
        SingleScore_button.setVisibility(View.INVISIBLE);

        //Single button clicked
        BUTTONSINGLE.setOnClickListener
                (
                        new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Make unecessary things INVISIBLE
                                BUTTONSINGLE.setVisibility(View.INVISIBLE);
                                BUTTONMULTI.setVisibility(View.INVISIBLE);

                                // Make necessary things VISIBLE
                                Reg_button.setVisibility(View.VISIBLE);
                                name_tit.setVisibility(View.VISIBLE);
                                txtname.setVisibility(View.VISIBLE);
                                PlayerNo(0, false, false, 0);
                            }
                        }
                );
        //Multiple_buton clicked
        BUTTONMULTI.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Make unecessary things INVISIBLE
                        BUTTONSINGLE.setVisibility(View.INVISIBLE);
                        BUTTONMULTI.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        txtname.setVisibility(View.VISIBLE);

                        PlayerNo(0, true, false, 0);
                    }
                }
        );


    }

    public void PlayerNo(int n, boolean c, boolean sc, int time) {
        playerList[n] = new Players();
        Input(playerList[n], c, sc, time);
    }

    public boolean isAlpha(String name) {
        return Pattern.matches("[a-zA-Z]+", name);
    }

    public void Input(final Players aPlayer, final boolean c, final boolean sc, final int time)
    {
        // Get BUTTONS:
        final Button SingleScore_button = (Button)findViewById(R.id.SingleScore_button);
        final Button Redo_button = (Button)findViewById(R.id.button_Redo);
        final Button BUTTONSCORE = (Button)findViewById(R.id.buttonScore);
        final Button Reg_button = (Button)findViewById(R.id.ButtonRegister);
        final Button BUTTONQ1 = (Button)findViewById(R.id.ButtonQ1);
        final Button BUTTONQ2 = (Button)findViewById(R.id.ButtonQ2);
        final Button BUTTONQ3 = (Button)findViewById(R.id.ButtonQ3);
        final Button BUTTONQ4 = (Button)findViewById(R.id.ButtonQ4);
        final Button BUTTONQ5 = (Button)findViewById(R.id.ButtonQ5);
        final Button BUTTONA = (Button)findViewById(R.id.buttonA);
        final Button BUTTONB = (Button)findViewById(R.id.buttonB);
        final Button BUTTONC = (Button)findViewById(R.id.buttonC);
        final Button BUTTONSTART = (Button) findViewById(R.id.StartButton);
        final Button BUTTONSKIP = (Button) findViewById(R.id.SkipButton);
        final Button BUTTONHINT = (Button) findViewById(R.id.HintButton);
        final Button BUTTONNEXT = (Button) findViewById(R.id.NextPlayerButton);

        // Get EDIT TEXTS:
        final EditText txtname = (EditText) findViewById(R.id.NameEditText);

        // Get TEXT VIEWS:
        final TextView name_tit = (TextView) findViewById(R.id.TextViewNameTit);
        final TextView hello = (TextView) findViewById(R.id.TextViewWelcome);
        final TextView question_txt = (TextView) findViewById(R.id.QuestionTextView);
        final TextView sol_txt = (TextView)findViewById(R.id.textViewSolution);
        final TextView score_txt = (TextView)findViewById(R.id.textViewScore);
        final TextView low_txt = (TextView)findViewById(R.id.textViewLow);
        final TextView high_txt = (TextView)findViewById(R.id.textViewHigh);
        final TextView notice_txt = (TextView)findViewById(R.id.textViewNotice);

        // REG BUTTON - Set click
        Reg_button.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        // Get name from text field
                        String name = txtname.getText().toString();

                        // Check whether name is VALID
                        if (isAlpha(name))
                        {
                            notice_txt.setText("Click button below to Start your Quiz!");
                            notice_txt.setVisibility(View.VISIBLE);

                            hello.setText("Student: " + name);
                            aPlayer.setName(name);

                            // Make unecessary things INVISIBLE: EditText name, name title & Start button
                            txtname.setVisibility(View.INVISIBLE);
                            Reg_button.setVisibility(View.INVISIBLE);
                            name_tit.setVisibility(View.INVISIBLE);

                            //Make Start visible
                            BUTTONSTART.setText("START");
                            BUTTONSTART.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                              notice_txt.setText("Name can only contain LETTERS in ALPHABETS! Re-enter your name.");
                              notice_txt.setVisibility(View.VISIBLE);
                        }
                                           }
                });

        // START BUTTON - Set click
        BUTTONSTART.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Make things INVISIBLE
                        notice_txt.setVisibility(View.INVISIBLE);
                        question_txt.setText("");
                        score_txt.setText("");
                        sol_txt.setText("");
                        BUTTONHINT.setVisibility(View.INVISIBLE);
                        BUTTONSKIP.setVisibility(View.INVISIBLE);
                        BUTTONA.setVisibility(View.INVISIBLE);
                        BUTTONB.setVisibility(View.INVISIBLE);
                        BUTTONC.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setText("GO TO QUESTION LIST");
                        BUTTONSTART.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        if (aPlayer.get1())
                            BUTTONQ1.setVisibility(View.VISIBLE);
                        if (aPlayer.get2())
                            BUTTONQ2.setVisibility(View.VISIBLE);
                        if (aPlayer.get3())
                            BUTTONQ3.setVisibility(View.VISIBLE);
                        if (aPlayer.get4())
                            BUTTONQ4.setVisibility(View.VISIBLE);
                        if (aPlayer.get5())
                            BUTTONQ5.setVisibility(View.VISIBLE);

                        // QUESTION SHOW UP
                        // QUESTION 1
                        BUTTONQ1.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                    public void onClick(View view){
                                    //Hide question buttons
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    question_txt.setText(Questions.ShowQuestion(1));
                                    question_txt.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(1));
                                    BUTTONB.setText(Questions.getB(1));
                                    BUTTONC.setText(Questions.getC(1));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);

                                    //Show hint and skip and question list
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    //Increase score
                                                    aPlayer.increaseScore(time);
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getB(1));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();

                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 2
                        BUTTONQ2.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(2);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(2));
                                    BUTTONB.setText(Questions.getB(2));
                                    BUTTONC.setText(Questions.getC(2));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Increase score
                                                    aPlayer.increaseScore(time);
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getA(2));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 3
                        BUTTONQ3.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(3);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(3));
                                    BUTTONB.setText(Questions.getB(3));
                                    BUTTONC.setText(Questions.getC(3));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    aPlayer.increaseScore(time);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getC(3));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 4
                        BUTTONQ4.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(4);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(4));
                                    BUTTONB.setText(Questions.getB(4));
                                    BUTTONC.setText(Questions.getC(4));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    aPlayer.increaseScore(time);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getC(4));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 5
                        BUTTONQ5.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(5);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(5));
                                    BUTTONB.setText(Questions.getB(5));
                                    BUTTONC.setText(Questions.getC(5));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Increase score
                                                    aPlayer.increaseScore(time);
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getA(5));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Hide buttons
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });

                        // SHOW RESULT
                        if (aPlayer.get1() == false && aPlayer.get2() == false && aPlayer.get3() == false && aPlayer.get4() == false && aPlayer.get5() == false)
                        {
                            score_txt.setText(aPlayer.getName() + "'s score is: " + aPlayer.getScore(time) + "/5");
                            BUTTONSTART.setText("You answered all the questions.");
                            score_txt.setVisibility(View.VISIBLE);

                            //SHOW REDO IF SINGLE PLAYER
                            if (!c && !sc && time < 2)
                            {
                                Redo_button.setVisibility(View.VISIBLE);
                            }
                            //SHOW SINGLE SCORE REVIEW BUTTON IF PLAYED AT LEAST 2 TIMES
                            if (time > 0 && !c && !sc)
                            {
                                SingleScore_button.setVisibility(View.VISIBLE);
                            }

                            //SHOW NEXT PLAYER IF MULTI
                            if (c) {
                                BUTTONNEXT.setVisibility(View.VISIBLE);
                                notice_txt.setText(aPlayer.getName() + " has answered all the questions, next player's turn.");
                                notice_txt.setVisibility(View.VISIBLE);
                            }

                            //SHOW REVIEW SCORE BUTTON IF BOTH PLAYERS FINISHED
                            if (sc) {
                                BUTTONSCORE.setVisibility(View.VISIBLE);
                                notice_txt.setText("Both players finished. Press Score Review for rankings.");
                                notice_txt.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                });

        //Redo Button click
        Redo_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        aPlayer.resetquestion();
                        aPlayer.SetScore(time+1);
                        Input(aPlayer, false, false, time+1);
                        BUTTONSTART.setText("START");
                        BUTTONSTART.setVisibility(View.VISIBLE);
                        Redo_button.setVisibility(View.INVISIBLE);
                        SingleScore_button.setVisibility(View.INVISIBLE);
                    }
                });

        //SINGLE SCORE BUTTON click
        SingleScore_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // Make unnecessary things INVISIBLE
                        SingleScore_button.setVisibility(View.INVISIBLE);
                        notice_txt.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setVisibility(View.INVISIBLE);
                        score_txt.setVisibility(View.INVISIBLE);
                        Redo_button.setVisibility(View.INVISIBLE);

                        String resultst = "Your scores in each time: ";

                        for (int j = 0; j<=time; j++)
                        {
                            switch (j)
                            {
                                case 0:
                                    resultst = resultst + "1st time: ";
                                    break;
                                case 1:
                                    resultst = resultst + "2nd time: ";
                                    break;
                                case 2:
                                    resultst = resultst + "3rd time: ";
                                    break;
                                default: break;
                            }
                            resultst = resultst + (aPlayer.getScore(j)) + "  ";
                        }
                        high_txt.setText(resultst);

                        String rankst = "Ranks among the times you tried are: ";

                        if (time == 2) {
                            //IF 1st time HIGHEST
                            if (aPlayer.getScore(0) >= aPlayer.getScore(1) && aPlayer.getScore(0) >= aPlayer.getScore(2)) {
                                rankst = rankst + " 1st time,";
                                if (aPlayer.getScore(1) >= aPlayer.getScore(2)) {
                                    rankst = rankst + " 2nd time, 3rd time.";
                                } else {
                                    rankst = rankst + " 3rd time, 2nd time.";
                                }
                            } else {
                                //IF 2nd time highest
                                if (aPlayer.getScore(1) >= aPlayer.getScore(0) && aPlayer.getScore(1) >= aPlayer.getScore(2)) {
                                    rankst = rankst + " 2nd time,";
                                    if (aPlayer.getScore(0) >= aPlayer.getScore(2)) {
                                        rankst = rankst + " 1st time, 3rd time.";
                                    } else {
                                        rankst = rankst + " 3rd time, 1st time.";
                                    }
                                } else {
                                    // IF 3rd time highest
                                    if (aPlayer.getScore(2) >= aPlayer.getScore(0) && aPlayer.getScore(2) >= aPlayer.getScore(1)) {
                                        rankst = rankst + " 3rd time,";
                                        if (aPlayer.getScore(1) >= aPlayer.getScore(0)) {
                                            rankst = rankst + " 2nd time, 1st time.";
                                        } else {
                                            rankst = rankst + " 1st time, 2nd time.";
                                        }
                                    }
                                }
                            }
                        }
                        if (time == 1)
                        {
                            if (aPlayer.getScore(0) >= aPlayer.getScore(1))
                            {
                                rankst = rankst + " 1st time, 2nd time.";
                            }
                            else {
                                rankst = rankst + " 2nd time, 1st time.";
                            }
                        }
                        low_txt.setText(rankst);
                        // Make necessary things VISIBLE
                        low_txt.setVisibility(View.VISIBLE);
                        high_txt.setVisibility(View.VISIBLE);

                        hello.setText("SCORE REVIEW");

                    }
                });

        //Next Player Button click
        BUTTONNEXT.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // Make unnecessary things INVISIBLE
                        notice_txt.setVisibility(View.INVISIBLE);
                        score_txt.setVisibility(View.INVISIBLE);
                        BUTTONNEXT.setVisibility(View.INVISIBLE);
                        BUTTONHINT.setVisibility(View.INVISIBLE);
                        BUTTONSKIP.setVisibility(View.INVISIBLE);
                        BUTTONQ1.setVisibility(View.INVISIBLE);
                        BUTTONQ2.setVisibility(View.INVISIBLE);
                        BUTTONQ3.setVisibility(View.INVISIBLE);
                        BUTTONQ4.setVisibility(View.INVISIBLE);
                        BUTTONQ5.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setText("GO TO QUESTION LIST");
                        hello.setText("Next Player.");
                        BUTTONSTART.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        txtname.setVisibility(View.VISIBLE);
                        question_txt.setText("");

                        PlayerNo(1, false, true, 0);
                    }
                });

        //Score Button For Multiplayers Rank click
        BUTTONSCORE.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // Make unnecessary things INVISIBLE
                        BUTTONSCORE.setVisibility(View.INVISIBLE);
                        notice_txt.setVisibility(View.INVISIBLE);
                        BUTTONNEXT.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setVisibility(View.INVISIBLE);
                        score_txt.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        low_txt.setVisibility(View.VISIBLE);
                        high_txt.setVisibility(View.VISIBLE);

                        hello.setText("SCORE REVIEW");
                        if (playerList[0].getScore(time) > playerList[1].getScore(time))
                        {
                            high_txt.setText(playerList[0].getName() + " has higher score with " + playerList[0].getScore(time) + "/5");
                            low_txt.setText(playerList[1].getName() + " has lower score with " + playerList[1].getScore(time) + "/5");
                        }
                        else if (playerList[0].getScore(time) < playerList[1].getScore(time))
                        {
                            high_txt.setText(playerList[1].getName() + " has higher score with " + playerList[1].getScore(time) + "/5");
                            low_txt.setText(playerList[0].getName() + " has lower score with " + playerList[0].getScore(time) + "/5");
                        }
                        else if (playerList[0].getScore(time) == playerList[1].getScore(time))
                        {
                            high_txt.setText(playerList[1].getName() + " and " + playerList[0].getName() + " have same score with " + playerList[1].getScore(time) + "/5");
                            low_txt.setText("");
                        }
                    }
                });
    }
}




