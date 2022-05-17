package com.company;



import sun.invoke.empty.Empty;

import javax.swing.*;
import java.util.Scanner;

public class Game {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private boolean isComplete = false;

    public Game(){
        gameBoard = new GameBoard();
        player1 = new Player(Space.X, 1);
        player2 = new Player(Space.O, 2);
    }


    public void Play() {
        //Clean this up so that it handles repetition and ends the game when its over.

        Scanner myScan = new Scanner(System.in);
        gameBoard.Draw();

        while(true) {


            System.out.println("Player 1:  pick a column (0-6).");
            int location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player1.getPiece(), location);
            boolean ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 1 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();

            System.out.println("Player 2:  pick a column (0-6).");
            location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player2.getPiece(), location);
            ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 2 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();
        }




    }

    private boolean CheckForWin() {
        //row
        for(int row = 0; row< 6; row++){
            for (int col = 0;col < 7 - 3;col++){
                if ((gameBoard.spaces[row][col] ==  gameBoard.spaces[row][col+1]) &&  (gameBoard.spaces[row][col+2] ==  gameBoard.spaces[row][col+3]) && (gameBoard.spaces[row][col+1] ==  gameBoard.spaces[row][col+2]) && !gameBoard.spaces[row][col].equals(Space.EMPTY) ){
                    System.out.println("1");
                    return true;
                }
            }
        }
        //check for 4 up and down
        for(int row = 0; row < 6- 3; row++){
            for(int col = 0; col < 7; col++){
                if ((gameBoard.spaces[row][col] == gameBoard.spaces[row+1][col]) &&  (gameBoard.spaces[row+2][col] ==  gameBoard.spaces[row+3][col])&& (gameBoard.spaces[row + 1][col] ==  gameBoard.spaces[row +2][col]) && !gameBoard.spaces[row][col].equals(Space.EMPTY) ){
                    System.out.println("2");

                    return true;
                }
            }
        }
        //check upward diagonal
        for(int row = 3; row < 6; row++){
            for(int col = 0; col < 4; col++){
                if ((gameBoard.spaces[row][col] ==  gameBoard.spaces[row-1][col+1]) && (gameBoard.spaces[row-2][col+2] == gameBoard.spaces[row-3][col+3] )&& (gameBoard.spaces[row - 1][col + 1] ==  gameBoard.spaces[row - 2][col + 2]) && !gameBoard.spaces[row][col].equals(Space.EMPTY)){
                    System.out.println("3");

                    return true;
                }
            }
        }
        //check downward diagonal
        for(int row = 0; row < 6 - 3; row++){
            for(int col = 0; col < 7 - 3; col++){
                if ((gameBoard.spaces[row][col] == gameBoard.spaces[row+1][col+1]) && (gameBoard.spaces[row+2][col+2] == gameBoard.spaces[row+3][col+3])&& (gameBoard.spaces[row + 1][col+1] ==  gameBoard.spaces[row +2][col + 2])&& !gameBoard.spaces[row][col].equals(Space.EMPTY))
                {
                    System.out.println("4");

                    return true;
                }
            }
        }
        return false;
    }

    private boolean IsFilled(){

        for (int i = 0; i < 42; i++) {
            for (int j = 0; j < 42; j++) {
                if(this.gameBoard.spaces[i][j] == Space.EMPTY) {

                    return false;

                }
            }

        }

        return true;
        //Implement this method.

    }

}
