package com.manoj;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        boolean secgameOver = true;
        int score = 800;
        int secscore = 10000;
        int levelCompleted = 5;
        int seclevelCompleted = 8;
        int bonus = 100;
        int secbonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("First final score was " + finalScore);

        }
//if changed the boolean values results can be altered

        else if (secgameOver){
            int secfinalScore = secscore + (seclevelCompleted * secbonus);
            System.out.println("Second final score was " + secfinalScore);


    }
}}
