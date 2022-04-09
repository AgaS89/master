package Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ArraysFunctionsTest {

    @Test
    @DisplayName("Test for FOR loop")
     public void forStaticTableTest() {
        ArraysFunctions arraysFunctions = new ArraysFunctions();
        List<String> names = new LinkedList<>();

        names.add("Agata");
        names.add("Ania");
        names.add("Beata");

        arraysFunctions.forStaticTable(names);
    }

    @Test
    @DisplayName("While loop for display animals")
    public void whileStaticTableTest(){
        ArraysFunctions arraysFunctions = new ArraysFunctions();
        List<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Monkey");
        animals.add("Dog");

        arraysFunctions.whileStaticTable(animals);
    }

}
