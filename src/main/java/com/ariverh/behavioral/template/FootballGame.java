package com.ariverh.behavioral.template;

public class FootballGame extends GameTemplate{
    @Override
    void startGame() {
        System.out.println("足球比赛开始");
    }

    @Override
    void gaming() {
        System.out.println("足球比赛进行中");
    }

    @Override
    void endGame() {
        System.out.println("足球比赛结束");
    }
}
