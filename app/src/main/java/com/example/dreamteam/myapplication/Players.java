package com.example.dreamteam.myapplication;

/**
 * Created by dreamteam on 12/6/16.
 */

public class Players
{
    private String name;
    private int[] score = new int[3];
    private boolean q1,q2,q3,q4,q5;
    //  Constructor - sets default values for name.
    public Players ()
    {
        name = "";
        q1 = true;
        q2 = true;
        q3 = true;
        q4 = true;
        q5 = true;
        score[0] = 0;
    }

    // Reset Questions Status to redo the quiz
    public void resetquestion ()
    {
        q1 = true;
        q2 = true;
        q3 = true;
        q4 = true;
        q5 = true;
    }

    // Set 0 to score of redo times
    public void SetScore(int n)
    {
        score[n] = 0;
    }

    // Sets name
    public void setName (String nameValue)
    {
        name = nameValue;
    }

    // Increase Score
    public void increaseScore (int n) { score[n]++; }

    // Set answered
    public void set1()
    {q1 = false;}
    public void set2()
    {q2 = false;}
    public void set3()
    {q3 = false;}
    public void set4()
    {q4 = false;}
    public void set5()
    {q5 = false;}

    // Get questions status
    public boolean get1()
    {return q1;}
    public boolean get2()
    {return q2;}
    public boolean get3()
    {return q3;}
    public boolean get4()
    {return q4;}
    public boolean get5()
    {return q5;}

    // Returns name
    public String getName ()
    {
        return name;
    }

    //Return score
    public int getScore (int n) {return score[n];}


}
