package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Total command line inputs: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + (i + 1) + ": " + args[i]);
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
