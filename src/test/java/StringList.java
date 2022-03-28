import java.util.Arrays;
import java.util.List;

public class StringList {

    public List<String> name = Arrays.asList("Agata", "Anna", "Monika", "Martyna", "Grzegorz");
    String result = String.valueOf(name
            .stream()
            .count());


}
