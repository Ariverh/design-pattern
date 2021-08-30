package com.ariverh.behavioral.template;

public abstract class GameTemplate {
    abstract void startGame();
    abstract void gaming();
    abstract void endGame();

    public void Game(){
        startGame();
        gaming();
        endGame();
    }
}
