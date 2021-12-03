package com.tldav;

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


        while (true) {
            System.out.print("Enter cells: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 9) {
                System.out.println("Please enter 9 characters consisting of _, X, O.");
                continue;
            }
            if (!input.matches("^[XO_]*$")) {
                System.out.println("Valid characters: _, X, O. Do not enter spaces");
                continue;
            }
            System.out.println("---------");
            String lineOne = input.substring(0, 3);
            String lineTwo = input.substring(3, 6);
            String lineThree = input.substring(6, 9);
            System.out.println("|" + lineOne.replace("", " ") + "|");
            System.out.println("|" + lineTwo.replace("", " ") + "|");
            System.out.println("|" + lineThree.replace("", " ") + "|");
            System.out.println("---------");
            break;
        }


    }
}
