package Learning;

import java.util.List;
import java.util.stream.Stream;


public class NameStream {

    public void streamNames(List<String> streamNames){

        Stream<String> name =  streamNames.stream();

        name.filter(s -> s.endsWith("a"))
            .forEach(System.out::println);
    }
}
