package se.lexicon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n=== Converter App ===");
            System.out.println("1. Currency Converter");
            System.out.println("2. Temperature Converter");
            System.out.println("3. Length Converter");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CurrencyConverter.convert(scanner);
                    break;

                case 2:
                    TemperatureConverter.convert(scanner);
                    break;

                case 3:
                    LengthConverter.convert(scanner);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}