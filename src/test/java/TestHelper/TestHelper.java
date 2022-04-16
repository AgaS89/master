package TestHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestHelper {

    public List<String> getAnimals(){

        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Mouse");
        animals.add("Snake");

        return animals;
    }

    public List<String> getFirstNamesFM(){
        List<String> names = new ArrayList<>();
        names.add("Grzegorz");
        names.add("Marek");
        names.add("Tomasz");
        names.add("Monika");
        names.add("Natalia");
        names.add("Karolina");
        names.add("Daria");

        return names;
    }

    public List<String> getMaleFirstNames(){
        List<String> maleNames = new ArrayList<>();
        maleNames.add("Krzysztof");
        maleNames.add("Grzegorz");
        maleNames.add("Kornel");
        maleNames.add("Dariusz");

        return maleNames;
    }

    public List<String> getFemaleFirstName(){
        List<String> femaleNames = new ArrayList<>();
        femaleNames.add("Agnieszka");
        femaleNames.add("Katarzyna");
        femaleNames.add("Alicja");
        femaleNames.add("Dominika");

        return femaleNames;
    }

    public Integer getRandomNumber( int min, int max){
        Random numbers = new Random();
        int number =  numbers.nextInt(max+1) + min;

        return number;
    }

    public Integer getRandomNumber(int max){
        return getRandomNumber(0,max);
    }

    public List<Integer> getStaticNumbers(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(89);
        integerList.add(56);
        integerList.add(33);
        integerList.add(7);
        integerList.add(100);
        integerList.add(9);

        return integerList;
    }

    public List<Integer> get10Numbers(){
        List<Integer> tenNumbersList = new  ArrayList<>();
        for (int i = 1; i <= 10; i++){
            tenNumbersList.add(i);
        }
        return tenNumbersList;

    }

    public List<Integer> getRandomNumbers(int n){
        List<Integer> randomNumbers = new ArrayList<>();

        for(int i = 0; i < n; i++){
            randomNumbers.add(getRandomNumber(1000));

        }

        return randomNumbers;
    }

    public List<Integer> getNextNumbersstartedFromNtoM(int n, int m){
        List<Integer> nextNumbers = new ArrayList<>();

        for (int i = n; i <= m; i++){
            nextNumbers.add(i);
        }
        return nextNumbers;
    }

    /**
     * generator test caseów
     */
    public void getTestCase(){
        int varType = getRandomNumber(2);
        int size = getRandomNumber(3, 10);
        int randomType = getRandomNumber(1);

        if(varType == 0){
            System.out.println("Return array of strings (min " + size + " records)");
        }else if (varType == 1){
            if (randomType == 0){
                System.out.println("Return array of n random numbers");
            }else {

                System.out.println("Return array of n next numbers");
            }
        }else
        {
            if (randomType == 0){
                System.out.println("Return array of " + size + " random numbers");
            }else {

                System.out.println("Return array of " + size + " next numbers");
            }
        }
    }
}


//
//for (int i = 0; animal.size()>i; i++){
//
//        System.out.println(animal.get(i));
//        }