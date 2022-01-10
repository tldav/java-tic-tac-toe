package com.tldav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ************************* Part 1 ***********************

//        String sampleGrid = "X O X\nO O O\nX X O";
//        System.out.println(sampleGrid);


//        if (input.length() != 9) System.out.println("Please enter 9 characters.");
//        if (!input.matches("^[XO_]*$")) System.out.println("Valid characters: X, O, _ do not enter spaces");
//
//        System.out.println("---------");
//        String lineOne = input.substring(0, 3);
//        String lineTwo = input.substring(3, 6);
//        String lineThree = input.substring(6, 9);
//        System.out.println("|" + lineOne.replace("", " ") + "|");
//        System.out.println("|" + lineTwo.replace("", " ") + "|");
//        System.out.println("|" + lineThree.replace("", " ") + "|");
//        System.out.println("---------");


        // ************************* Part 2 ***********************

//        while (true) {
//            System.out.print("Enter cells: ");
//            String input = scanner.nextLine().toUpperCase();
//
//            if (input.length() != 9) {
//                System.out.println("Please enter 9 characters consisting of _, X, O.");
//                continue;
//            }
//            if (!input.matches("^[XO_]*$")) {
//                System.out.println("Valid characters: _, X, O. Do not enter spaces");
//                continue;
//            }
//            System.out.println("---------");
//            String lineOne = input.substring(0, 3);
//            String lineTwo = input.substring(3, 6);
//            String lineThree = input.substring(6, 9);
//            System.out.println("|" + lineOne.replace("", " ") + "|");
//            System.out.println("|" + lineTwo.replace("", " ") + "|");
//            System.out.println("|" + lineThree.replace("", " ") + "|");
//            System.out.println("---------");
//            break;
//        }

        // *********************** Part 3 *************************

        String[][] gameBoard = generateGameBoard();

        System.out.println("---------");
        for (String[] element : gameBoard) {
            System.out.println("| " + Arrays.toString(element)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", "") + " |");
        }
        System.out.println("---------");

        int xCount = 0;
        int oCount = 0;
        int _Count = 0;
//        int xScore = 0;
        // x * 1 = 88;
//        int oScore = 0;
        // o * 1 = 79;
        int score = 0;
        boolean xWins = false;
        boolean oWins = false;
        boolean isImpossible = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j].equalsIgnoreCase("x")) {
                    xCount++;
                    score += 88;
                    if (score == 264) {
                        xWins = true;
                    }
                }
                if (gameBoard[i][j].equalsIgnoreCase("o")) {
                    oCount++;
                    score += 79;
                    if (score == 237) {
                        oWins = true;
                    }
                }
                if (gameBoard[i][j].equalsIgnoreCase("_") ||
                        gameBoard[i][j].equalsIgnoreCase(" ")) {
                    _Count++;
                }
            }
            score = 0;




            for (int j = 0; j < 3; j++) {
                if (gameBoard[j][i].equalsIgnoreCase("x")) {

                    score += 88;
                    if (score == 264) {
                        xWins = true;
                    }
                }
                if (gameBoard[j][i].equalsIgnoreCase("o")) {

                    score += 79;
                    if (score == 237) {
                        oWins = true;
                    }
                }
            }
            score = 0;
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameBoard[j][i].equalsIgnoreCase("x")) {
//
//                    score += 88;
//                    if (score == 264) {
//                        xWins = true;
//                    }
//                }
//                if (gameBoard[j][i].equalsIgnoreCase("o")) {
//
//                    score += 79;
//                    if (score == 237) {
//                        oWins = true;
//                    }
//                }
//            }
//            score = 0;
//        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                boolean diagCheck = i == j || (i % 2 == 0 && j % 2 == 0);
//                System.out.println(diagCheck);
//                if (gameBoard[i][j].equalsIgnoreCase("x")) {
//
//                    if (diagCheck) {
//
//                        score += 88;
//                        if (score == 264) {
//                            xWins = true;
//                        }
//                    }
//
//                }
//                if (gameBoard[i][j].equalsIgnoreCase("o")) {
//
//                    if (diagCheck) {
//
//                        score += 79;
//                        if (score == 237) {
//                            oWins = true;
//                        }
//                    }
//                }
//            }
//            System.out.println("THE SCORE IS WRONG: " + score);
//            score = 0;
//        }

        String a = gameBoard[0][0];

        char c = gameBoard[0][2].charAt(0);
        char e = gameBoard[1][1].charAt(0);
        char g = gameBoard[2][0].charAt(0);
        char i = gameBoard[2][2].charAt(0);


        System.out.println("does X win?: " + xWins);
        System.out.println("does O win?: " + oWins);


        if (Math.abs(xCount - oCount) > 1 || (xWins && oWins)) {
            isImpossible = true;
            System.out.println("impossible");
        } else if (xWins && !oWins && !isImpossible) {
            System.out.println("X wins");
        } else if (oWins && !xWins && !isImpossible) {
            System.out.println("O wins");
        } else {
            System.out.println("Game not finished");
        }

        System.out.println("X count: " + xCount);
        System.out.println("O count: " + oCount);
        System.out.println("_ count: " + _Count);



//
//        int diag1 = a + e + i;
//        int diag2 = c + e + g;



    }

    public static boolean isWinner(char player, char[][] gameBoard) {
        char coo = gameBoard[0][0];
        return true;
    }

    public static String[][] generateGameBoard() {
        String[][] gameBoard = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter cells: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 9) {
                System.out.println("Please enter 9 characters consisting of _, X, O.");
                continue;
            }
            if (!input.matches("^[XO_ ]*$")) {
                System.out.println("Valid characters: _, X, O. Do not enter spaces");
                continue;
            }

            String[] inputArray = input.split("");
            int count = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    gameBoard[i][j] = inputArray[count++];
                }
            }
            break;
        }
        return gameBoard;
    }
}
