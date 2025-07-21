
import java.util.*;

public class RemoveDuplicatesStringBuilder {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
