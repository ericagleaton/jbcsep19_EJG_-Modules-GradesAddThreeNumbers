package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will enter 3 numbers.\n");
        for (int i=1; i < 4; i++) {
            System.out.println("Please enter a whole number " +i + ": ");
            num = scanner.nextInt();
            total = num + total;
            System.out.println(("#" + i + " was " + num + ";\n"));
        }System.out.println("This the total " + total);
    }
}
