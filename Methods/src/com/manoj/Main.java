package com.manoj;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highscore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;

            return finalscore;
        }
        return -1;
    }
}
