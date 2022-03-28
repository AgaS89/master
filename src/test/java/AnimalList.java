import java.util.ArrayList;
import java.util.List;

public class AnimalList {


    public static void main (String args[]){

        List<String> animals = new ArrayList<String>();

        //incjalizacja z tworzeniem listy
        animals.add("Kot");
        animals.add("Pies");
        animals.add("Papuga");
        animals.add("Kanarek");
        animals.add("Mysz");

        animals = animal(animals);

      //  for (int i = 0; animals.size() > i; i++){
     //       System.out.println(animals.get(i));
    //    }
    }

    public static List<String> animal(List<String> animals){

        for (int i = 0; animals.size() > i; i++){

            System.out.println(animals.get(i));
        }
      return animals;
    }

}
