package Arrays;

import java.util.List;

public class ArraysFunctions {

    public void forStaticTable(List<String> name){

        for (String names : name){
            System.out.println(names);
        }
    }

    public void whileStaticTable(List<String> animal){

        int i = 0;
        while (i < animal.size()) {
            System.out.println(animal.get(i++));
        }
    }
}
