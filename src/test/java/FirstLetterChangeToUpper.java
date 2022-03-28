import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstLetterChangeToUpper {


    public void changeLetter(String changeLetter){
        String[] words = changeLetter.split(" ");
        System.out.println(words.length);

        Stream<String> names = Arrays.stream(words);

        String newSentence = names.map(name ->name.toUpperCase())
                                  .map(name-> name.charAt(0) + name.substring(1).toLowerCase())
                                  .collect(Collectors.joining(" "));

        System.out.println(newSentence);
    }
}


