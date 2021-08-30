package com.ariverh.behavioral.template;

public class BasketballGame extends GameTemplate{

    @Override
    void startGame() {
        System.out.println("开始篮球比赛");
    }

    @Override
    void gaming() {
        System.out.println("篮球比赛进行中");
    }

    @Override
    void endGame() {
        System.out.println("篮球比赛结束");
    }
}
