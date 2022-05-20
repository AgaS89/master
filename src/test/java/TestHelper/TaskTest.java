package TestHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TaskTest {

    @Test
    @DisplayName("0. Check last animal")
    public void checkGetLastAnimal1(){
        Task t = new Task();
        Assertions.assertEquals("Snake", t.getLastAnimal());
    }

    @Test
    @DisplayName("0. Check last animal")
    public void checkGetLastAnimal2(){
        Task t = new Task();
        Assertions.assertEquals("Snake", t.getLastAnimal2());
    }

    @Test
    @DisplayName("1. Check list Animals which have 4 letter")
    public void animals1(){
        List<String> animals = new Task().getAnimalsNameShorterThen4Letters();

        List<String> animalsOrg = new ArrayList<>();
        animalsOrg.add("Cat");
        animalsOrg.add("Dog");

        Assertions.assertLinesMatch(animalsOrg, animals);
    }

    @Test
    @DisplayName("1. Check list Animals which have 4 letter")
    public void animals2(){
        List<String> animals = new Task().getAnimalsNameShorterThen4Letters();

        List<String> animalsOrg = new ArrayList<>();
        animalsOrg.add("Dog");
        animalsOrg.add("Cat");

        Assertions.assertLinesMatch
                (animalsOrg.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()),
                 animals.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                );
    }

    @Test
    @DisplayName("2. Check male names only")
    public void maleNames1(){
        List<String> maleNames = new Task().getMaleNames();

        List<String> maleNamesOrg = new ArrayList<>();
        maleNamesOrg.add("Grzegorz");
        maleNamesOrg.add("Marek");
        maleNamesOrg.add("Tomasz");

        Assertions.assertLinesMatch(maleNamesOrg, maleNames);
    }

    @Test
    @DisplayName("2. Check male names only")
    public void maleNames2(){
        List<String> maleNames = new Task().getMaleNames();

        List<String> maleNamesOrg = new ArrayList<>();
        maleNamesOrg.add("Marek");
        maleNamesOrg.add("Grzegorz");
        maleNamesOrg.add("Tomasz");

        Assertions.assertLinesMatch
                (maleNamesOrg.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()),
                 maleNames.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                );
    }

    @Test
    @DisplayName("3. Check the longest female name, shortest male name")
    public void checkFemaleMaleNames1(){
        List<String> resultNames = new Task().getShortMaleLongFemaleName1();

        List<String> resultNamesOrg = new ArrayList<>();
        resultNamesOrg.add("Marek");
        resultNamesOrg.add("Karolina");

        Assertions.assertLinesMatch
                (resultNamesOrg.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()),
                  resultNames.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
    }

    @Test
    @DisplayName("4. Check order ASC names")
    public void checkGetSortAscNames(){
        String resultNames = new Task().getSortAscName();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("4. Check order ASC names")
    public void checkGetSortAscNames2(){
        String resultNames = new Task().getSortAscName2();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("4. Check order ASC names")
    public void checkGetSortAscNames3(){
        String resultNames = new Task().getSortAscName2();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("5. Check order DSC names")
    public void checkGetSortNameDesc1(){
        String resultNames = new Task().getSortNameDesc();

        String expected = "Katarzyna; Dominika; Alicja; Agnieszka";

        Assertions.assertEquals(expected, resultNames);
    }

    @Test
    @DisplayName("6. Check min number")
    public void checkGetMinNumber(){
        int number = new Task().getMinNumber();
        int expected = 1;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("6. Check min number")
    public void checkGetMinNumber2(){
        int number = new Task().getMinNumber2();
        int expected = 1;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("7. Check avg")
    public void checkGetAvg(){
        double number = new Task().getAvg();
        double expected = 32.5;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("8. Check min sum")
    public void checkGetMinSum(){
        int number = new Task().getMinSum();
        int expected = 8;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("8. Check min sum")
    public void checkGetMinSum2(){
        int number = new Task().getMinSum2();
        int expected = 8;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("9. Check max sum")
    public void checkGetMaxSum1(){
        int number = new Task().getMaxSum1();
        int expected = 145;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("9. Check max sum")
    public void checkGetMaxSum2(){
        int number = new Task().getMaxSum2();
        int expected = 145;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("10. Check unique value from 3 lists")
    public void checkGetUniqValues(){
        List<String> uniqueValue = new Task().getUniqValue();
       String[] expectedArray = new String[]{"Agnieszka", "Alicja", "Daria", "Dariusz", "Dominika", "Grzegorz","Karolina", "Katarzyna", "Kornel", "Krzysztof", "Marek", "Monika", "Natalia", "Tomasz"};
       List expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(expected, uniqueValue);
    }

    @Test
    @DisplayName("10. Check unique value from 3 lists")
    public void checkGetUniqValues2(){
        List<String> uniqueValue = new Task().getUniqValue2();
        String[] expectedArray =  new String[]{"Agnieszka", "Alicja", "Daria", "Dariusz", "Dominika", "Grzegorz","Karolina", "Katarzyna", "Kornel", "Krzysztof", "Marek", "Monika", "Natalia", "Tomasz"};
        List expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(expected, uniqueValue);
    }

    @Test
    @DisplayName("12. Check sort list for static numbers")
    public void checkGegetSortValue(){
        List<Integer> sortedValue = new Task().getSortValue();
        Integer[] expectedArray =  new Integer[]{1, 7, 9, 33, 56, 89};
        List expected = new ArrayList<>(Arrays.asList(expectedArray));

        Assertions.assertEquals(expected, sortedValue);
    }

    @Test
    @DisplayName("11. Json has used all names from t4")
    public void checkGetJsonFormat(){
    String actual = new Task().getJsonFormat();
    String expected =
            "[" + "\n" +
             " {" + "\"" + "name" + "\"" + ":" + "\"" + "Grzegorz" + "\"" + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Grzegorz" + "\"" + "}" + ","

             + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Marek" + "\""  + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Marek" + "\"" + "}" + ","


             + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Tomasz" + "\""  + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Tomasz" + "\"" + "}" + ","

             + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Monika" + "\""  + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Monika" + "\"" + "}" + ","

             + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Natalia" + "\""  + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Natalia" + "\"" + "}" + ","

             + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Karolina" + "\""  + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Karolina" + "\"" + "}" + ","

            + "\n" + " {" + "\"" + "name" + "\"" + ":" + "\"" + "Daria" + "\"" + ","
                    + "\"" + "lastName" + "\"" + ":" + "\"" + "Daria" + "\"" + "}"
            + "\n" + "]";

        Assertions.assertEquals(expected, actual);
    }

}
