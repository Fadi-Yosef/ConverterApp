package se.lexicon;

import java.util.Scanner;

public class TemperatureConverter {

    public static void convert(Scanner scanner) {

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            double result = (value * 9 / 5) + 32;
            System.out.println("Result: " + result + " F");
        } else if (choice == 2) {
            double result = (value - 32) * 5 / 9;
            System.out.println("Result: " + result + " C");
        } else {
            System.out.println("Invalid choice");
        }
    }
}