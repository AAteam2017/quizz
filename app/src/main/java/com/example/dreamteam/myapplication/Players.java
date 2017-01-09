package com.example.dreamteam.myapplication;

/**
 * Created by dreamteam on 12/30/16.
 */

public class Players
{
    private String name;
    private int[] score = new int[3];
    private boolean q1,q2,q3,q4,q5;
    //  Default names
    public Players ()
    {
        name = "Default";
        q1 = true;
        q2 = true;
        q3 = true;
        q4 = true;
        q5 = true;
        score[0] = 0;
    }
    // Sets name when user enters
    public void nameSet (String nameValue)
    {
        name = nameValue;
    }

    // Gets name
    public String nameGet ()
    {
        return name;
    }

    // Single player: Restart
    public void restart ()
    {
        q1 = true;
        q2 = true;
        q3 = true;
        q4 = true;
        q5 = true;
    }

    // If not restart, score of restart times:
    public void scoreSet(int n)
    {
        score[n] = 0;
    }

    // Score counts:
    public void scoreIncrease (int n) { score[n]++; }

    // Sets answers at the start:
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

    // Gets questions:
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

    //Return score
    public int scoreGet (int n) {return score[n];}


}


