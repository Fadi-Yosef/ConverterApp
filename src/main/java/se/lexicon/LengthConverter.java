package se.lexicon;

import java.util.Scanner;

public class LengthConverter {

    public static void convert(Scanner scanner) {

        System.out.println("Length Converter");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        System.out.print("Enter the length value: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            double km = value / 1000;
            System.out.println(value + " meters = " + km + " kilometers");

        } else if (choice == 2) {
            double meters = value * 1000;
            System.out.println(value + " kilometers = " + meters + " meters");

        } else {
            System.out.println("Invalid option.");
        }
    }
}
