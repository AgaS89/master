package Learning;

import java.util.ArrayList;
import java.util.List;

public class ToCheck {

    public static void main(String args[]) {

        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);


        do {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");

        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }

    }




    }


