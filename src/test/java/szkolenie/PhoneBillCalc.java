package szkolenie;

import java.util.Scanner;

public class PhoneBillCalc {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter base cost of plan: ");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overatgeMinutes = scanner.nextDouble();

        scanner.close();

        double overageCharge = calculateOverages(overatgeMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);

    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return  tax;

    }

    public static void calculateAndPrintBill (double base, double overage, double tax){
        double finalTotal = base * overage * tax;

        System.out.println("Phone Bill Statment");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%2f", overage));
        System.out.println("Tax: $" + String.format("%2f", tax));
        System.out.println("Total: $" + String.format("%2f", finalTotal));
    }
}
