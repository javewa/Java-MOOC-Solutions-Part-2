package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(3, 3);
        board.initiateRandomCells(1.0);
        System.out.println(board.test(1.0));
        
        
        GameOfLifeTester tester = new GameOfLifeTester(board);
        tester.play();
    }
}
