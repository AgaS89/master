package Learning;

import java.util.List;

public class Examples {


    public void changeValues(int a, int b){

        System.out.println("obecnie zmienna a to: " + a);
        System.out.println("obecnie zmienna b to: " + b);

        int c=a;
        a=b;
        b=c;

        System.out.println("Po zmianie a wynosi: " + a);
        System.out.println("Po zmianie b wynosi: " + b);

    }

    public void animal(List<String> animals){

        for (int i = 0; animals.size() > i; i++){

            System.out.println(animals.get(i));
        }
    }

    public void tabliczkaMnozenia(int columnNumber, int rowNumber) {

        String row = "0";
        //utworzenie pierwszej linii
        for (int i = 1; i <= columnNumber; i++) {
            //row = row + " \t" + i;
            row += " \t" + i;
        }

        System.out.println(row);

        //utworzenie pozostałych wierszy i kolumn
        for (int j = 1; j <= rowNumber; j++) {
            row = j + "";
            for (int i = 1; i <= columnNumber; i++) {
                row += " \t" + i * j;
           }

            System.out.println(row);

        }
    }

}
