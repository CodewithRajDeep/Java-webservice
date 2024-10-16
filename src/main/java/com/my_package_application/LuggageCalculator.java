package com.my_package_application;
import java.util.Scanner;

public class LuggageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the luggage (in kg): ");
        double weight = scanner.nextDouble();

        double charge = calculateCharge(weight);

        System.out.printf("The charge for transporting the luggage is: $%.2f\n", charge);
    }

    public static double calculateCharge(double weight) {
        if (weight <= 40) {
            return 5.75;
        } else if (weight <= 500) {
            int numIntervals = (int) Math.ceil((weight - 40) / 18);
            return 5.75 + numIntervals * 3.88;
        } else {
            int numIntervalsLessThan500 = (int) Math.ceil((weight - 40) / 18);
            double excessWeight = weight - 500;
            return 5.75 + numIntervalsLessThan500 * 3.88 + excessWeight * 0.67;
        }
    }
}
