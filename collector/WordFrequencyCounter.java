package collector;

import java.util.*;
import java.util.stream.*;

class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "hello world hello java hello streams";
        String[] words = text.split(" ");
        Map<String, Long> freq = Arrays.stream(words)
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(freq);
    }
}
