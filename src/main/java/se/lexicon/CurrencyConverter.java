package se.lexicon;

import java.util.Scanner;

public class CurrencyConverter {

    public static void convert(Scanner scanner) {

        double rate = 10.0; // example: 1 USD = 10 SEK

        System.out.println("Currency Converter");
        System.out.println("1. SEK to USD");
        System.out.println("2. USD to SEK");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (choice == 1) {
            double usd = amount / rate;
            System.out.println(amount + " SEK = " + usd + " USD");

        } else if (choice == 2) {
            double sek = amount * rate;
            System.out.println(amount + " USD = " + sek + " SEK");

        } else {
            System.out.println("Invalid option");
        }
    }
}