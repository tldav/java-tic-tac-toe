package com.tldav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String sampleGrid = "X O X\nO O O\nX X O";
//        System.out.println(sampleGrid);


        System.out.print("Enter cells: ");
        String input = scanner.nextLine();

        if (input.length() != 9) System.out.println("please enter again");
        if (!input.matches("^[XO_]*$")) System.out.println("wrong");


    }
}
