package com.example.dreamteam.myapplication;

/**
 * Created by dreamteam on 12/30/16.
 */

public class Questions
{
    public static String QuestionsShow(int n)
    {
        String quest="";
        switch (n)
        {
            case 1:
                quest = "Who is the president of the United States of America?"; // B
                break;
            case 2:
                quest = "You’ve got a 10 x 10 x 10 cube made up of 1 x 1 x 1 smaller cubes. The outside of the larger cube is completely painted red. On how many of the smaller cubes is there no red paint?"; //A
                break;
            case 3:
                quest = "The Federal Reserve raised the base interest rate for the United States. How will the dollar react?"; // C
                break;
            case 4:
                quest = "How old is Kim Kardashian? ";  // C
                break;
            case 5:
                quest = "How much money does Mariah Carey earn from 'All I Want For Christmas Is You' in one Christmas?"; // A
            default:
                break;
        }
        return quest;
    }

    public static String getA(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "Hillary Clinton";
                break;
            case 2:
                ans = "512";
                break;
            case 3:
                ans = "Appreciate";
                break;
            case 4:
                ans = "27";
                break;
            case 5:
                ans = "$480,000";
                break;
            default:
                break;
        }
        return ans;
    }
    public static String getB(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "Donald Trump";
                break;
            case 2:
                ans = "729";
                break;
            case 3:
                ans = "Stable";
                break;
            case 4:
                ans = "41";
                break;
            case 5:
                ans = "$48,000";
                break;
            default:
                break;
        }
        return ans;
    }
    public static String getC(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "Barack Obama";
                break;
            case 2:
                ans = "343";
                break;
            case 3:
                ans = "Depreciate";
                break;
            case 4:
                ans = "36";
                break;
            case 5:
                ans = "$4,800,000";
                break;
            default:
                break;
        }
        return ans;
    }



}
