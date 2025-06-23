package Day5_Strings;
import java.util.Scanner;
public class CustomStringLength {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.next();
        int customLen = customLength(input);
        int builtInLen = input.length();
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
}