package se.lexicon;

import java.util.Scanner;

public class LengthConverter {

    public static void convert(Scanner scanner) {

        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();

        double km = meters / 1000;

        System.out.printf("Result: %.2f meters = %.3f km%n", meters, km);
    }
}
