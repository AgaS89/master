package TestHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCasesRandom {

    /**
     * Return array of strings (min 17 records)
     */
    public List<String> get17Furnitures(){
        List<String> furnitures = new ArrayList<>();
        furnitures.add("sofa");
        furnitures.add("komoda");
        furnitures.add("łóżko");
        furnitures.add("szafa");
        furnitures.add("stół");
        furnitures.add("krzesło");
        furnitures.add("lampa");
        furnitures.add("wanna");
        furnitures.add("taboret");
        furnitures.add("fotel");
        furnitures.add("kanapa");
        furnitures.add("tapczan");
        furnitures.add("umywalka");
        furnitures.add("sedes");
        furnitures.add("prysznic");
        furnitures.add("szafka");
        furnitures.add("wentylator");

        return furnitures;

    }

    /**
     * Return array of strings (min 10 records)
     */
    public List<String> get10GamesList(){
        List<String> games = new ArrayList<>();

        games.add("Tomb Raider");
        games.add("Horizon");
        games.add("The last from us");
        games.add("GTA");
        games.add("Uncharted");
        games.add("World of Tanks");
        games.add("Lineage 2");
        games.add("The Sims");
        games.add("League of Lehends");
        games.add("Battlefield");

        return games;
    }

    /**
     * Return array of strings (min 5 records)
     */
    public List<String> get5Animals(){
        List<String> animals = new ArrayList<>();
        animals.add("kot");
        animals.add("pies");
        animals.add("papuga");
        animals.add("zolw");
        animals.add("rybka");

        return animals;
    }

    /**
     * Return array of strings (min 11 records)
     */
    public List<String> get11Names(){
        List<String> names = new ArrayList<>();
        names.add("Grzegorz");
        names.add("Agneszka");
        names.add("Daniel");
        names.add("Daria");
        names.add("Katarzyna");
        names.add("Anna");
        names.add("Tomasz");
        names.add("Magdalena");
        names.add("Małgorzala");
        names.add("Stanisław");
        names.add("Dagmara");

        return names;
    }

    /**
     * Return array of strings (min 6 records)
     */
    public List<String> get6Countries(){
        List<String> countries = new ArrayList<>();
        countries.add("Polska");
        countries.add("Niemcy");
        countries.add("Meksyk");
        countries.add("Malediwy");
        countries.add("Seszele");
        countries.add("Mauritius");

        return countries;
    }

    /**
     * Random numbers
     */
    public Integer getRandomNumber( int min, int max){
        Random numbers = new Random();
        int number =  numbers.nextInt(max + 1) + min;

        return number;
    }

    /**
     * Return array of 6 random numbers
     */
    public List<Integer> get6RandomNumbers(){
        List<Integer> random6Numbers = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            random6Numbers.add(getRandomNumber(0, 1000));
        }
        return random6Numbers;
    }

    /**
     * Return array of 12 random numbers
     */
    public List<Integer> get12RandomNumbers(){
        List<Integer> random12Numbers = new ArrayList<>();

        for (int i = 0; i < 12; i++){
            random12Numbers.add(getRandomNumber(0,1000));
        }
        return random12Numbers;
    }

    /**
     * Return array of 15 random numbers
     */
    public List<Integer> get15RandomNumbers(){
        List<Integer> random15Numbers = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            random15Numbers.add(getRandomNumber(0, 1000));
        }
        return random15Numbers;
    }

    /**
     * Return array of n next numbers
     */
    public List<Integer> getNnextNumbers(int n){
        List<Integer> nNextNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            nNextNumbers.add(n + i);
        }
        return nNextNumbers;
    }
/**
 * Return array of 18 next numbers
 */
public List<Integer> getNext18Numbers(int n){
    List<Integer> next18Numbers = new ArrayList<>();


    for(int i = 0 ; i < 18; i++){
        next18Numbers.add(n + i);
    }
    return next18Numbers;
}

}
