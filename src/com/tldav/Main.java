package com.tldav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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









        // ************************************************










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

//        char[][] gameArray = new char[3][3];




        int[][] gameArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(gameArray));

        for (int[] element : gameArray) {
            System.out.println(Arrays.toString(element)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        }





//        String str = "clutso";
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(i);
//        }

//        final int size = scanner.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(Math.abs(i - j) + " ");
//            }
//            System.out.println();
//        }



        // turn my solution into a 2D array. done
        // [
        //   [X, O, _],
        //   [_, O, _],
        //   [O, X, X]
        // ]

        // check for win is priority 1. end if win
        //  'X' + 'X' + 'X' = 264
        //  OR
        //  'O' + 'O' + 'O' = 237

        //  impossible if both win
        //  'X' + 'X' + 'X' = 264
        //  AND
        //  'O' + 'O' + 'O' = 237


        //  check for impossible is priority 2. end if not win but is impossible.
        //      impossible -> if ((Xs - Os) > 1) {impossible} will need Math.abs() for this

        //      check for draw is priority 3. end if not win and not impossible but is draw.
        //          draw -> if (Xs + Os == 9) {draw}

        //              if none of these are the case, the state is game not finished.
    }
}
