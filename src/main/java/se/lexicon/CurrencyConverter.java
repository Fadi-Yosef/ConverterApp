package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrencyConverter {

    public static void convert(Scanner scanner) {

        System.out.print("Enter amount in SEK: ");
        double sek = scanner.nextDouble();

        double usd = sek * 0.09;

        System.out.println("Result: " + sek + " SEK = " + usd + " USD");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Converted at: " + now.format(format));
        if (sek < 0) {
            System.out.println("Amount cannot be negative.");
            return;}
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input.");
            scanner.next();
            return;
        }
        System.out.printf("Result: %.2f SEK = %.2f USD%n", sek, usd);

    }
}