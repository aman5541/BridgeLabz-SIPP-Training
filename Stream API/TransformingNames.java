
import java.util.*;
import java.util.stream.*;

public class TransformingNames {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("john","alice","bob");
        customers.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
