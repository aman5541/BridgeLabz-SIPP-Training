package Day5_Strings;
import java.util.Scanner;
public class ToUppercaseManual {
    public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String input = sc.nextLine();
        System.out.println("Uppercase: " + toUpperCase(input));
    }
}