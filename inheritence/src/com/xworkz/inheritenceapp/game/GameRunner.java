package com.xworkz.inheritenceapp.game;

public class GameRunner {
    public static void main(String[] args) {
        // Creating a copy of the parent class and invoking 5 methods
        Game game = new Game();
        game.gameDetails();
        game.gameTypes();
        game.gamePurpose();
        game.gameSkills();
        game.gameHistory();

        System.out.println("\n");

        // Creating a copy of the subclass using parent reference type and invoking 5 methods
        Game ref = new Chess();
        ref.gameDetails();
        ref.gameTypes();
        ref.gamePurpose();
        ref.gameSkills();
        ref.gameHistory();

        System.out.println("\n");

        // Creating a copy of the subclass using subclass reference type and invoking 5 methods
        Chess chess = new Chess();
        chess.gameDetails();
        chess.chessObjective();
        chess.chessStrategy();
        chess.chessPieces();
        chess.chessPopularity();
    }

    }

