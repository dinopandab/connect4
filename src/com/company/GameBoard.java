package com.company;



public class GameBoard {
    // 0 | 1 | 2
    //--- --- ---
    // 3 | 4 | 5
    //--- --- ---
    // 6 | 7 | 8
    Space spaces[][];
    String spacesText[][];


    public GameBoard() {
        spaces = new Space[6][7];


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                spaces[i][j] = Space.EMPTY;
            }

        }

        spacesText = new String[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j ++){
                spacesText[i][j] = j + " " ;
            }
        }


    }

    public void PlaceOnBoard(Space pieceToPlace, int column ) {
        int locationToPlace = 0;



        if (spaces[5][column] == Space.EMPTY) {
           locationToPlace = 5;
        } else if (spaces[4][column] == Space.EMPTY) {
            locationToPlace = 4;
        } else if (spaces[3][column] == Space.EMPTY) {
            locationToPlace = 3;
        } else if (spaces[2][column] == Space.EMPTY) {
            locationToPlace =2;
        } else if (spaces[1][column] == Space.EMPTY) {
            locationToPlace = 1;
        } else if (spaces[0][column] == Space.EMPTY) {
            locationToPlace = 0;
        }
        spaces[locationToPlace][column] = pieceToPlace;

        if(pieceToPlace == Space.X){
            spacesText[locationToPlace][column] = "X";
        }
        else{
            spacesText[locationToPlace][column] = "O";
        }
    }
        public void Draw() {
            System.out.println("");
            System.out.println(" " + spacesText[0][0] + "  | " + spacesText[0][1] + "  | " + spacesText[0][2] + "  | " + spacesText[0][3] + " | " + spacesText[0][4] + " | " + spacesText[0][5] + " | " + spacesText[0][6]);
            System.out.println("---------------------------------");
            System.out.println(" " + spacesText[1][0] + "  | " + spacesText[1][1] + "  | " + spacesText[1][2] + "  | " + spacesText[1][3] + " | " + spacesText[1][4] + " | " + spacesText[1][5] + " | " + spacesText[1][6]);
            System.out.println("---------------------------------");
            System.out.println(" "+ spacesText[2][0] + "  | " + spacesText[2][1] + "  | " + spacesText[2][2] + "  | " + spacesText[2][3] + " | " + spacesText[2][4] + " | " + spacesText[2][5] + " | " + spacesText[2][6]);
            System.out.println("---------------------------------");
            System.out.println(" " + spacesText[3][0] + "  | " + spacesText[3][1] + "  | " + spacesText[3][2] + "  | " + spacesText[3][3] + " | " + spacesText[3][4] + " | " + spacesText[3][5] + " | " + spacesText[3][6]);
            System.out.println("---------------------------------");
            System.out.println(" "+ spacesText[4][0] + "  | " + spacesText[4][1] + "  | " + spacesText[4][2] + "  | " + spacesText[4][3] + " | " + spacesText[4][4] + " | " + spacesText[4][5] + " | " + spacesText[4][6]);
            System.out.println("---------------------------------");
            System.out.println(" " + spacesText[5][0] + "  | " + spacesText[5][1] + "  | " + spacesText[5][2] + "  | " + spacesText[5][3] + " | " + spacesText[5][4] + " | " + spacesText[5][5] + " | " + spacesText[5][6]);
            System.out.println("---------------------------------");


            System.out.println("");
        }
    }




//        System.out.println("");
//                System.out.println(" 0 | 1 | 2");
//                System.out.println("--- --- ---");
//                System.out.println(" 3 | 4 | 5");
//                System.out.println("--- --- ---");
//                System.out.println(" 6 | 7 | 8");
//                System.out.println("");
