package se.lexicon;

import java.util.Scanner;

public class TemperatureConverter {

    public static void convert(Scanner scanner) {

        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.printf("Result: %.2f C = %.2f F%n", c, f);
    }
}
