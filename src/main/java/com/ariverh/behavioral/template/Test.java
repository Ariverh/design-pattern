package com.ariverh.behavioral.template;

public class Test {
    public static void main(String[] args) {
        System.out.println("===================足球比赛====================");
        FootballGame footballGame = new FootballGame();
        footballGame.Game();
        System.out.println("===================篮球比赛====================");
        BasketballGame basketballGame = new BasketballGame();
        basketballGame.Game();
    }
}
