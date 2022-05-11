package TestHelper;

import javax.swing.*;
import java.util.List;


public class Loops {

    public static void main(String args[]){

        TestHelper testHelper = new TestHelper();
        List<String> loopsAnimals = testHelper.getAnimals();
        List<String> loopsFirstNames = testHelper.getFirstNamesFM();
        List<String> loopsMaleNames = testHelper.getMaleFirstNames();
        List<String> loopsFemaleNames = testHelper.getFemaleFirstName();
        List<Integer> loopsRandomNumbers = testHelper.getRandomNumbers(10);

        /**
         * Animals
         */
        System.out.println("Using FOR loop animals: ");
        for (int i = 0; i < loopsAnimals.size(); i++){
            System.out.println(loopsAnimals.get(i));
        }

        System.out.println("Using WHILE loop animals: ");

        int i = 0;
        while (i < loopsAnimals.size()){
            System.out.println(loopsAnimals.get(i++));
        }

        System.out.println("Using FOREACH loop animals: ");
        for (String s : loopsAnimals
             ) {
            System.out.println(s);
        }

        System.out.println("Using STREAM animals: ");
        loopsAnimals.stream()
                .forEach((k) -> {
                    System.out.println(k);
        });

        System.out.println("Diffrent STREAM animals: ");
        loopsAnimals.stream().forEach(System.out::println);

        /**
         * Female and male first names
         */
        System.out.println("Using FOR loop female and male names: ");
        for (int a = 0; a < loopsFirstNames.size(); a++){
            System.out.println(loopsFirstNames.get(a));
        }

        System.out.println("Using WHILE loop female and male names: ");
        int licznik = 0;
        while (licznik < loopsFirstNames.size()){
            System.out.println(loopsFirstNames.get(licznik++));
        }

        System.out.println("Using FOREACH loop female and male names: ");
        for (String s : loopsFirstNames
             ) {
            System.out.println(s);
        }

        System.out.println("Using STREAM female and male names: ");
        loopsFirstNames.stream()
                .forEach((k) -> {
                    System.out.println(k);
                        }
                    );

        System.out.println("Diffrent STREAM: ");
        loopsFirstNames.stream()
                .forEach(System.out::println);

        /**
         * Male first names
         */
        System.out.println("Using FOR loop male names: ");
         for (int b = 0; b < loopsMaleNames.size(); b++){
             System.out.println(loopsMaleNames.get(b));
         }

        System.out.println("Using WHILE loop male names: ");
        int licznikMale = 0;
        while (licznikMale < loopsMaleNames.size()){
            System.out.println(loopsMaleNames.get(licznikMale++));
        }

        System.out.println("Using FOREACH loop male names: ");
        for (String s : loopsMaleNames
             ) {
            System.out.println(s);
        }

        System.out.println("Using STREAM male names: ");
        loopsMaleNames.stream()
                .forEach((k) -> {
                    System.out.println(k);
                });

        System.out.println("Diffrent STREAM male names: ");
        loopsMaleNames.stream()
                .forEach(System.out::println);

        /**
         * Female first names
         */

        System.out.println("Using FOR loop female names: ");
        for (int c = 0; c < loopsFemaleNames.size(); c++){
            System.out.println(loopsFemaleNames.get(c));
        }

        System.out.println("Using WHILE loop female names: ");
        int d =0;
        while (d < loopsFemaleNames.size()){
            System.out.println(d++);
        }

        System.out.println("Using FOREACH loop female names: ");
        for (String s : loopsFemaleNames
             ) {
            System.out.println(s);
        }

        System.out.println("Using STREAM female: ");
        loopsFemaleNames.stream()
                .forEach((k) -> {
                    System.out.println(k);
                });

        System.out.println("Diffrent STREAM female: ");
         loopsFemaleNames.stream()
                .forEach(System.out::println);


        /**
         * List random numbers
          */
        for (Integer s: loopsRandomNumbers
             ) {
            System.out.println(s);
        }
    }







}
