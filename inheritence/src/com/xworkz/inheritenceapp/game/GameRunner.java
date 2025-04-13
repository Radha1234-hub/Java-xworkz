package com.xworkz.inheritenceapp.game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameDetails();

        Chess chess = new Chess();
        chess.gameDetails();

        Game ref = new Chess();
        ref.gameDetails();

        Chess downcasted = (Chess) ref;
        downcasted.gameDetails();

    }
}
