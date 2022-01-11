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
        int score = 0;
        boolean xWins = false;
        boolean oWins = false;
        boolean isImpossible = false;

        if (
                (gameBoard[0][0].equalsIgnoreCase("x") &&
                        gameBoard[1][1].equalsIgnoreCase("x") &&
                        gameBoard[2][2].equalsIgnoreCase("x"))
                        ||
                        (gameBoard[0][2].equalsIgnoreCase("x") &&
                                gameBoard[1][1].equalsIgnoreCase("x") &&
                                gameBoard[2][0].equalsIgnoreCase("x"))) {
            xWins = true;
        }

        if (
                (gameBoard[0][0].equalsIgnoreCase("o") &&
                        gameBoard[1][1].equalsIgnoreCase("o") &&
                        gameBoard[2][2].equalsIgnoreCase("o"))
                        ||
                        (gameBoard[0][2].equalsIgnoreCase("o") &&
                                gameBoard[1][1].equalsIgnoreCase("o") &&
                                gameBoard[2][0].equalsIgnoreCase("o"))) {
            oWins = true;
        }

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

        if (Math.abs(xCount - oCount) > 1 || (xWins && oWins)) {
            System.out.println("Impossible");
        } else if (xWins && !oWins && !isImpossible) {
            System.out.println("X wins");
        } else if (oWins && !xWins && !isImpossible) {
            System.out.println("O wins");
        } else if (_Count == 0) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }

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
