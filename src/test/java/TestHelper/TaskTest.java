package TestHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TaskTest {

    @Test
    @DisplayName("Check last animal")
    public void checkGetLastAnimal1(){
        Task t = new Task();
        Assertions.assertEquals("Snake", t.getLastAnimal());
    }

    @Test
    @DisplayName("Check last animal")
    public void checkGetLastAnimal2(){
        Task t = new Task();
        Assertions.assertEquals("Snake", t.getLastAnimal2());
    }

    @Test
    @DisplayName("Check list Animals which have 4 letter")
    public void animals1(){
        List<String> animals = new Task().getAnimalsNameShorterThen4Letters();

        List<String> animalsOrg = new ArrayList<>();
        animalsOrg.add("Cat");
        animalsOrg.add("Dog");

        Assertions.assertLinesMatch(animalsOrg, animals);
    }

    @Test
    @DisplayName("Check list Animals which have 4 letter")
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
    @DisplayName("Check male names only")
    public void maleNames1(){
        List<String> maleNames = new Task().getMaleNames();

        List<String> maleNamesOrg = new ArrayList<>();
        maleNamesOrg.add("Grzegorz");
        maleNamesOrg.add("Marek");
        maleNamesOrg.add("Tomasz");

        Assertions.assertLinesMatch(maleNamesOrg, maleNames);
    }

    @Test
    @DisplayName("Check male names only")
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
    @DisplayName("Check the longest female name, shortest male name")
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
    @DisplayName("Check order ASC names")
    public void checkGetSortAscNames(){
        String resultNames = new Task().getSortAscName();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("Check order ASC names")
    public void checkGetSortAscNames2(){
        String resultNames = new Task().getSortAscName2();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("Check order ASC names")
    public void checkGetSortAscNames3(){
        String resultNames = new Task().getSortAscName2();

        String expect = "Dariusz, Grzegorz, Kornel, Krzysztof";

        Assertions.assertEquals(expect, resultNames);
    }

    @Test
    @DisplayName("Check order DSC names")
    public void checkGetSortNameDesc1(){
        String resultNames = new Task().getSortNameDesc();

        String expected = "Katarzyna; Dominika; Alicja; Agnieszka";

        Assertions.assertEquals(expected, resultNames);
    }

    @Test
    @DisplayName("Check min number")
    public void checkGetMinNumber(){
        int number = new Task().getMinNumber();
        int expected = 1;

        Assertions.assertEquals(expected, number);
    }

    @Test
    @DisplayName("Check avg")
    public void checkGetAvg(){
        double number = new Task().getAvg();
        double expected = 32.5;

        Assertions.assertEquals(expected, number);
    }
}
