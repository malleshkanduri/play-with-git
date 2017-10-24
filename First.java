import java.util.List;
import java.util.Arrays;

public class First {
    static public void main(String str[]) {
        List<String> list = Arrays.asList("one", "two", "three");

         list
            .stream()
            .filter(x -> x.startsWith("o"))
            .forEach(System.out::println);
    }
}
