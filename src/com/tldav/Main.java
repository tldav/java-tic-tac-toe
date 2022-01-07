package com.tldav;

import java.util.Arrays;
import java.util.Locale;
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



        String[][] gameArray = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameArray[i][j] = scanner.next().toUpperCase();
            }
        }

        System.out.println(Arrays.deepToString(gameArray));

        for (String[] element : gameArray) {
            System.out.println(Arrays.toString(element)
                    .replace("[", "")
                    .replace(",", "")
                    .replace("]", ""));
        }

        char a = gameArray[0][0].charAt(0);
        char b = gameArray[0][1].charAt(0);
        char c = gameArray[0][2].charAt(0);
        char d = gameArray[1][0].charAt(0);
        char e = gameArray[1][1].charAt(0);
        char f = gameArray[1][2].charAt(0);
        char g = gameArray[2][0].charAt(0);
        char h = gameArray[2][1].charAt(0);
        char i = gameArray[2][2].charAt(0);

        int row1 = a + b + c;
        int row2 = d + e + f;
        int row3 = g + h + i;

        int col1 = a + d + g;
        int col2 = b + e + h;
        int col3 = c + f + i;

        int diag1 = a + e + i;
        int diag2 = c + e + g;

        System.out.println(a + b + c);
        System.out.println(d + e + f);
        System.out.println(g + h + i);







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



        // turn prior solution into a 2D array. done
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
