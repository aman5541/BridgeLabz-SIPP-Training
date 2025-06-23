package Day5_Strings;
import java.util.Scanner;
public class StringLengthManual {
    public static int getLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Length of string: " + getLength(input));
    }
}
