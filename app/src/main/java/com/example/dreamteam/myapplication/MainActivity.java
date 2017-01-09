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

        // BUTTONS:
        final Button BUTTONScoreSingle = (Button)findViewById(R.id.BUTTONScoreSingle);
        final Button BUTTONReplay = (Button)findViewById(R.id.button_Redo);
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

        // BLANKS:
        final EditText textname = (EditText) findViewById(R.id.BlankEditName);

        // TEXTS:
        final TextView name_tit = (TextView) findViewById(R.id.NameString);
        final TextView hello = (TextView) findViewById(R.id.WelcomeString);
        final TextView question_text = (TextView)findViewById(R.id.QuestionString);
        final TextView sol_text = (TextView)findViewById(R.id.SolutionString);
        final TextView score_text = (TextView)findViewById(R.id.ScoreString);
        final TextView low_text = (TextView)findViewById(R.id.LowerScoreString);
        final TextView high_text = (TextView)findViewById(R.id.HigherScoreString);
        final TextView namewrong_text = (TextView)findViewById(R.id.NameWrongString);

        // Start screen:
        BUTTONReplay.setVisibility(View.INVISIBLE);
        namewrong_text.setVisibility(View.INVISIBLE);
        BUTTONSCORE.setVisibility(View.INVISIBLE);
        BUTTONQ1.setVisibility(View.INVISIBLE);
        BUTTONQ2.setVisibility(View.INVISIBLE);
        BUTTONQ3.setVisibility(View.INVISIBLE);
        BUTTONQ4.setVisibility(View.INVISIBLE);
        BUTTONQ5.setVisibility(View.INVISIBLE);
        BUTTONA.setVisibility(View.INVISIBLE);
        BUTTONB.setVisibility(View.INVISIBLE);
        BUTTONC.setVisibility(View.INVISIBLE);
        question_text.setVisibility(View.INVISIBLE);
        sol_text.setVisibility(View.INVISIBLE);
        score_text.setVisibility(View.INVISIBLE);
        BUTTONSTART.setVisibility(View.INVISIBLE);
        Reg_button.setVisibility(View.INVISIBLE);
        BUTTONNEXT.setVisibility(View.INVISIBLE);
        textname.setVisibility(View.INVISIBLE);
        high_text.setVisibility(View.INVISIBLE);
        low_text.setVisibility(View.INVISIBLE);
        name_tit.setVisibility(View.INVISIBLE);
        BUTTONHINT.setVisibility(View.INVISIBLE);
        BUTTONSKIP.setVisibility(View.INVISIBLE);
        BUTTONScoreSingle.setVisibility(View.INVISIBLE);



        //SINGLE PLAYER:
        BUTTONSINGLE.setOnClickListener
                (
                        new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // HIDE
                                BUTTONSINGLE.setVisibility(View.INVISIBLE);
                                BUTTONMULTI.setVisibility(View.INVISIBLE);

                                // SHOW
                                Reg_button.setVisibility(View.VISIBLE);
                                name_tit.setVisibility(View.VISIBLE);
                                textname.setVisibility(View.VISIBLE);

                                playerCode(0, false, false, 0);
                            }
                        }
                );

        //TWO PLAYERS:
        BUTTONMULTI.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // HIDE
                        BUTTONSINGLE.setVisibility(View.INVISIBLE);
                        BUTTONMULTI.setVisibility(View.INVISIBLE);

                        // SHOW
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        textname.setVisibility(View.VISIBLE);

                        playerCode(0, true, false, 0);
                    }
                }
        );


    }

    public void playerCode(int n, boolean c, boolean both, int time) {
        playerList[n] = new Players();
        Input(playerList[n], c, both, time);
    }

    public boolean realName(String name) {return Pattern.matches("^[A-Za-z\\s]+$", name);
    }

    public void Input(final Players playerX, final boolean c, final boolean both, final int time)
    {
        // BUTTONS
        final Button BUTTONScoreSingle = (Button)findViewById(R.id.BUTTONScoreSingle);
        final Button BUTTONReplay = (Button)findViewById(R.id.button_Redo);
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

        // BLANKS
        final EditText textname = (EditText) findViewById(R.id.BlankEditName);

        // TEXTS
        final TextView name_tit = (TextView) findViewById(R.id.NameString);
        final TextView hello = (TextView) findViewById(R.id.WelcomeString);
        final TextView question_text = (TextView) findViewById(R.id.QuestionString);
        final TextView sol_text = (TextView)findViewById(R.id.SolutionString);
        final TextView score_text = (TextView)findViewById(R.id.ScoreString);
        final TextView low_text = (TextView)findViewById(R.id.LowerScoreString);
        final TextView high_text = (TextView)findViewById(R.id.HigherScoreString);
        final TextView namewrong_text = (TextView)findViewById(R.id.NameWrongString);

        // Registration for players:
        Reg_button.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        // Gets name:
                        String name = textname.getText().toString();

                        // REAL NAME:
                        if (realName(name))
                        {
                            namewrong_text.setText("Start the AAteam Quiz!!");
                            namewrong_text.setVisibility(View.VISIBLE);

                            hello.setText("Player: " + name);
                            playerX.nameSet(name);

                            // HIDE:
                            textname.setVisibility(View.INVISIBLE);
                            Reg_button.setVisibility(View.INVISIBLE);
                            name_tit.setVisibility(View.INVISIBLE);

                            // SHOW
                            BUTTONSTART.setText("BEGIN!");
                            BUTTONSTART.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            namewrong_text.setText("Please enter valid letters only!");
                            namewrong_text.setVisibility(View.VISIBLE);
                        }
                    }
                });

        // START:
        BUTTONSTART.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // HIDE
                        namewrong_text.setVisibility(View.INVISIBLE);
                        question_text.setText("");
                        score_text.setText("");
                        sol_text.setText("");
                        BUTTONHINT.setVisibility(View.INVISIBLE);
                        BUTTONSKIP.setVisibility(View.INVISIBLE);
                        BUTTONA.setVisibility(View.INVISIBLE);
                        BUTTONB.setVisibility(View.INVISIBLE);
                        BUTTONC.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setText("GO TO QUESTION LIST");
                        BUTTONSTART.setVisibility(View.INVISIBLE);

                        // SHOW
                        if (playerX.get1())
                            BUTTONQ1.setVisibility(View.VISIBLE);
                        if (playerX.get2())
                            BUTTONQ2.setVisibility(View.VISIBLE);
                        if (playerX.get3())
                            BUTTONQ3.setVisibility(View.VISIBLE);
                        if (playerX.get4())
                            BUTTONQ4.setVisibility(View.VISIBLE);
                        if (playerX.get5())
                            BUTTONQ5.setVisibility(View.VISIBLE);

                        // LIST OF QUESTIONS:

                        // QUESTION 1
                        BUTTONQ1.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //SHOW NEXT SCREEN (HIDE QUESTIONS BUTTON:
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);

                                    //SHOW QUESTIONS AND ANSWERS OPTIONS, SHOW HINT AND SKIP:
                                    question_text.setText(Questions.QuestionsShow(1));
                                    question_text.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(1));
                                    BUTTONB.setText(Questions.getB(1));
                                    BUTTONC.setText(Questions.getC(1));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set1();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //Show:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                    //Hide:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);

                                                }
                                            });

                                    //RIGHT ANSWER: Answer B
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set1();
                                                    //Increases score
                                                    playerX.scoreIncrease(time);
                                                    sol_text.setText("Well done! RIGHT answer! Continue below: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //Show:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                    //Hide:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);

                                                }
                                            });

                                    //WRONG ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set1();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);

                                                }
                                            });
                                    // HINT clicked
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set1();
                                                    //Show answer: Question 1 answer is B
                                                    sol_text.setText("The correct answer is: : " + Questions.getB(1));
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);

                                                }
                                            });
                                    // SKIP clicked:
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set1();

                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);

                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);

                                                }
                                            });
                                }


                                });

                        // QUESTION 2
                        BUTTONQ2.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //SHOW NEXT SCREEN (HIDE QUESTIONS BUTTON:
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);

                                    //SHOW QUESTIONS AND ANSWERS OPTIONS, SHOW HINT AND SKIP:
                                    String quest = Questions.QuestionsShow(2);
                                    question_text.setText(quest);
                                    question_text.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(2));
                                    BUTTONB.setText(Questions.getB(2));
                                    BUTTONC.setText(Questions.getC(2));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER: Answer A
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set2();
                                                    //Increase score
                                                    playerX.scoreIncrease(time);
                                                    sol_text.setText("Well done! RIGHT answer! Continue below: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set2();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set2();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    // HINT clicked
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set2();
                                                    //Show answer: Question 2 answer is A
                                                    sol_text.setText("The correct answer is: : " + Questions.getA(2));
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP clicked:
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set2();
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
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
                                    //SHOW NEXT SCREEN (HIDE QUESTIONS BUTTON:
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);

                                    //SHOW QUESTIONS AND ANSWERS OPTIONS, SHOW HINT AND SKIP:
                                    String quest = Questions.QuestionsShow(3);
                                    question_text.setText(quest);
                                    question_text.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(3));
                                    BUTTONB.setText(Questions.getB(3));
                                    BUTTONC.setText(Questions.getC(3));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set3();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set3();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    //RIGHT ANSWER: Answer C
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set3();
                                                    sol_text.setText("Well done! RIGHT answer! Continue below: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    playerX.scoreIncrease(time);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT clicked
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set3();
                                                    //Show answer: Question 3 answer is C
                                                    sol_text.setText("The correct answer is: : " + Questions.getC(3));
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP clicked:
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set3();
                                                    //HIDE:
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
                                    //SHOW NEXT SCREEN (HIDE QUESTIONS BUTTON:
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //SHOW QUESTIONS AND ANSWERS OPTIONS, SHOW HINT AND SKIP:
                                    String quest = Questions.QuestionsShow(4);
                                    question_text.setText(quest);
                                    question_text.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(4));
                                    BUTTONB.setText(Questions.getB(4));
                                    BUTTONC.setText(Questions.getC(4));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set4();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set4();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER: Answer
                                    BUTTONC.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set4();
                                                    sol_text.setText("Well done! RIGHT answer! Continue below: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    playerX.scoreIncrease(time);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    // HINT clicked
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set4();
                                                    //Show answer: Question 4 answer is C
                                                    sol_text.setText("The correct answer is: : " + Questions.getC(4));
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });

                                    // SKIP clicked:
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set4();
                                                    //HIDE:
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
                                    //SHOW NEXT SCREEN (HIDE QUESTIONS BUTTON):
                                    BUTTONQ1.setVisibility(View.INVISIBLE);
                                    BUTTONQ2.setVisibility(View.INVISIBLE);
                                    BUTTONQ3.setVisibility(View.INVISIBLE);
                                    BUTTONQ4.setVisibility(View.INVISIBLE);
                                    BUTTONQ5.setVisibility(View.INVISIBLE);
                                    //SHOW QUESTIONS AND ANSWERS OPTIONS, SHOW HINT AND SKIP:
                                    String quest = Questions.QuestionsShow(5);
                                    question_text.setText(quest);
                                    question_text.setVisibility(View.VISIBLE);
                                    BUTTONA.setText(Questions.getA(5));
                                    BUTTONB.setText(Questions.getB(5));
                                    BUTTONC.setText(Questions.getC(5));
                                    BUTTONA.setVisibility(View.VISIBLE);
                                    BUTTONB.setVisibility(View.VISIBLE);
                                    BUTTONC.setVisibility(View.VISIBLE);
                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                    BUTTONHINT.setVisibility(View.VISIBLE);
                                    BUTTONSKIP.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER: Answer A
                                    BUTTONA.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set5();
                                                    //Increase score
                                                    playerX.scoreIncrease(time);
                                                    sol_text.setText("Well done! RIGHT answer! Continue below: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    BUTTONB.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set5();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
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
                                                    //Set answers:
                                                    playerX.set5();
                                                    sol_text.setText("WRONG answer! Click to continue: ");
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT clicked
                                    BUTTONHINT.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set5();
                                                    //Show answer: Question 5 answer is A
                                                    sol_text.setText("The correct answer is: : " + Questions.getA(5));
                                                    sol_text.setVisibility(View.VISIBLE);
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP clicked:
                                    BUTTONSKIP.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answers:
                                                    playerX.set5();
                                                    //HIDE:
                                                    BUTTONA.setVisibility(View.INVISIBLE);
                                                    BUTTONB.setVisibility(View.INVISIBLE);
                                                    BUTTONC.setVisibility(View.INVISIBLE);
                                                    BUTTONHINT.setVisibility(View.INVISIBLE);
                                                    BUTTONSKIP.setVisibility(View.INVISIBLE);
                                                    //SHOW START BUTTON:
                                                    BUTTONSTART.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });


                        // RESULTS SHOW:
                        if (playerX.get1() == false && playerX.get2() == false && playerX.get3() == false && playerX.get4() == false && playerX.get5() == false)
                        // PlayerX has finished all the question
                        {
                            score_text.setText(playerX.nameGet() + " has scored:  " + playerX.scoreGet(time) + " out of 5");
                            BUTTONSTART.setText("Quiz finished!");
                            score_text.setVisibility(View.VISIBLE);

                            //REPLAY BUTTON SHOW:
                            if (!c && !both && time < 2)
                            {
                                BUTTONReplay.setVisibility(View.VISIBLE);
                            }
                            //SCORE REVIEW BUTTON SHOW:
                            if (time > 1 && !c && !both)
                            {
                                BUTTONScoreSingle.setVisibility(View.VISIBLE);
                            }

                            //NEXT PLAYER BUTTON SHOW - TWO PLAYERS:
                            if (c) {
                                BUTTONNEXT.setVisibility(View.VISIBLE);
                                namewrong_text.setText(playerX.nameGet() + " has finished! Next player:");
                                namewrong_text.setVisibility(View.VISIBLE);
                            }

                            //SCORE REVIEW BUTTON - END:
                            if (both) {
                                BUTTONSCORE.setVisibility(View.VISIBLE);
                                namewrong_text.setText("Both players finished. Press Score Review for rankings.");
                                namewrong_text.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                });

        //REPLAY:
        BUTTONReplay.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        playerX.restart();
                        playerX.scoreSet(time+1);
                        Input(playerX, false, false, time+1);
                        BUTTONSTART.setText("START");
                        BUTTONSTART.setVisibility(View.VISIBLE);
                        BUTTONReplay.setVisibility(View.INVISIBLE);
                        BUTTONScoreSingle.setVisibility(View.INVISIBLE);
                    }
                });

        //SCORE REVIEW - SINGLE PLAYER:
        BUTTONScoreSingle.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // HIDE:
                        BUTTONScoreSingle.setVisibility(View.INVISIBLE);
                        namewrong_text.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setVisibility(View.INVISIBLE);
                        score_text.setVisibility(View.INVISIBLE);
                        BUTTONReplay.setVisibility(View.INVISIBLE);

                        String scorestatus= "SCORES LIST: ";
                        // 3 times default: can add more if needed
                        for (int j = 0; j<=time; j++)
                        {
                            switch (j)
                            {
                                case 0:
                                    scorestatus= scorestatus+ "First time:  ";
                                    break;
                                case 1:
                                    scorestatus= scorestatus+ "Second time: ";
                                    break;
                                case 2:
                                    scorestatus= scorestatus+ "Third time: ";
                                    break;
                                default: break;
                            }
                            scorestatus= scorestatus+ (playerX.scoreGet(j)) + "  ";
                        }
                        high_text.setText(scorestatus);

                        String playerRank = "Ranks of " + playerX.nameGet() +" in descending order: ";

                        if (time == 2) {
                            //First time
                            if (playerX.scoreGet(1) <= playerX.scoreGet(0) && playerX.scoreGet(2) <= playerX.scoreGet(0)) {
                                playerRank = playerRank + " 1st time - "  + playerX.scoreGet(0);
                                //1,2,3
                                if (playerX.scoreGet(1) >= playerX.scoreGet(2)) {
                                    playerRank = playerRank + " ,2nd time - " +  + playerX.scoreGet(1) + " ,3rd time - " +  + playerX.scoreGet(2);
                                } else {
                                    //1,3,2
                                    playerRank = playerRank + " ,3rd time - " +  + playerX.scoreGet(2) + " ,2nd time - " +  + playerX.scoreGet(1);
                                }
                            } else {


                                //Second time
                                if (playerX.scoreGet(0) <= playerX.scoreGet(1) && playerX.scoreGet(2) <= playerX.scoreGet(1)) {
                                    playerRank = playerRank + " 2nd time - " + playerX.scoreGet(1);
                                    //2,1,3
                                    if (playerX.scoreGet(0) >= playerX.scoreGet(2)) {
                                        playerRank = playerRank + " ,1st time - " +  + playerX.scoreGet(0) + " ,3rd time - " +  + playerX.scoreGet(2);
                                        //2,3,1
                                    } else {
                                        playerRank = playerRank + " ,2nd time - " +  + playerX.scoreGet(1) + " ,1st time - " +  + playerX.scoreGet(0);
                                    }
                                } else {
                                    //Third time
                                    if (playerX.scoreGet(2) >= playerX.scoreGet(0) && playerX.scoreGet(2) >= playerX.scoreGet(1)) {
                                        playerRank = playerRank + " 3rd time - " + playerX.scoreGet(2);
                                        //3,2,1
                                        if (playerX.scoreGet(1) >= playerX.scoreGet(0)) {
                                            playerRank = playerRank + " ,2nd time - " +  + playerX.scoreGet(1) + " ,1st time - " +  + playerX.scoreGet(0);
                                            //3,1,2
                                        } else {
                                            playerRank = playerRank + " ,1st time - " +  + playerX.scoreGet(0) + " ,2nd time - " +  + playerX.scoreGet(1);
                                        }
                                    }
                                }
                            }
                        }
                        if (time == 1)
                        {
                            if (playerX.scoreGet(0) >= playerX.scoreGet(1))
                            {
                                playerRank = playerRank + " 1st time - " +  + playerX.scoreGet(0) + " 2nd time - " +  + playerX.scoreGet(1);
                            }
                            else {
                                playerRank = playerRank + " 2nd time - " +  + playerX.scoreGet(1) + " 1st time - " +  + playerX.scoreGet(0);
                            }
                        }
                        low_text.setText(playerRank);
                        // SHOW
                        low_text.setVisibility(View.VISIBLE);
                        high_text.setVisibility(View.VISIBLE);

                        hello.setText("SCORE REVIEW");

                    }
                });

        //Next Player:

        BUTTONNEXT.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // HIDE:
                        namewrong_text.setVisibility(View.INVISIBLE);
                        score_text.setVisibility(View.INVISIBLE);
                        BUTTONNEXT.setVisibility(View.INVISIBLE);
                        BUTTONHINT.setVisibility(View.INVISIBLE);
                        BUTTONSKIP.setVisibility(View.INVISIBLE);
                        BUTTONQ1.setVisibility(View.INVISIBLE);
                        BUTTONQ2.setVisibility(View.INVISIBLE);
                        BUTTONQ3.setVisibility(View.INVISIBLE);
                        BUTTONQ4.setVisibility(View.INVISIBLE);
                        BUTTONQ5.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setText("BACK TO QUESTION LIST");
                        hello.setText("Next Player");
                        BUTTONSTART.setVisibility(View.INVISIBLE);

                        // SHOW
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        textname.setVisibility(View.VISIBLE);
                        question_text.setText("");

                        playerCode(1, false, true, 0);
                    }
                });

        //SCORE REVIEW - TWO PLAYERS:
        BUTTONSCORE.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // HIDE:
                        BUTTONSCORE.setVisibility(View.INVISIBLE);
                        namewrong_text.setVisibility(View.INVISIBLE);
                        BUTTONNEXT.setVisibility(View.INVISIBLE);
                        BUTTONSTART.setVisibility(View.INVISIBLE);
                        score_text.setVisibility(View.INVISIBLE);

                        // SHOW
                        low_text.setVisibility(View.VISIBLE);
                        high_text.setVisibility(View.VISIBLE);

                        hello.setText("SCORE REVIEW");
                        if (playerList[0].scoreGet(time) > playerList[1].scoreGet(time))
                        {
                            high_text.setText(playerList[0].nameGet() + " WINS with " + playerList[0].scoreGet(time) + " /5");
                            low_text.setText(playerList[1].nameGet() + " LOSES with " + playerList[1].scoreGet(time) + " /5");
                        }
                        else if (playerList[0].scoreGet(time) < playerList[1].scoreGet(time))
                        {
                            high_text.setText(playerList[1].nameGet() + " WINS with " + playerList[1].scoreGet(time) + " /5");
                            low_text.setText(playerList[0].nameGet() + " LOSES with " + playerList[0].scoreGet(time) + " /5");
                        }
                        else if (playerList[0].scoreGet(time) == playerList[1].scoreGet(time))
                        {
                            high_text.setText(playerList[1].nameGet() + " and " + playerList[0].nameGet() + " DRAWN with " + playerList[1].scoreGet(time) + " /5");
                            low_text.setText("");
                        }


                    }
                });
    }

    private void TestUpload () {

        int i = 1 + 1;
    }
}









