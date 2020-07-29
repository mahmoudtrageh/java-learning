package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 800, 8, 200);
//        System.out.println("your final score is = " + highScore);
//
//        highScore = calculateScore(true, 20000, 10, 300);
//        System.out.println("your final score is = " + highScore);

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("mahmoud", score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("ahmed", score);

        score = calculateHighScorePosition(500);
        displayHighScorePosition("ali", score);

        score = calculateHighScorePosition(300);
        displayHighScorePosition("said", score);

        score = calculateHighScorePosition(1000);
        displayHighScorePosition("hossam", score);

        score = calculateHighScorePosition(80);
        displayHighScorePosition("mahmoud", score);
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonous) {
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonous);
//            finalScore += 1000;
//            return finalScore;
//        }
//            return -1;
//
//    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into the position");
        System.out.println(position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return  position;
    }
}
