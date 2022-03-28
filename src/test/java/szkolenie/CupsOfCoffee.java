package szkolenie;

import java.util.Scanner;

public class CupsOfCoffee {
    public static void main (String arg[]){
        System.out.println("What is a season of the year?");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();

        System.out.println("Write a number of cups");
        int numberCups = scanner.nextInt();

        System.out.println("Write a adjective of season");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day, I drink a minimum of " + numberCups + " cups of coffee");
    }
}
