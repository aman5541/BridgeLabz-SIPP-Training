package Day5_Strings;
import java.util.Scanner;
public class ToLowercaseManual {
    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase string: ");
        String input = sc.nextLine();
        System.out.println("Lowercase: " + toLowerCase(input));
    }
}