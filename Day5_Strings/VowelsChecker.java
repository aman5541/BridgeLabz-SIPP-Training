package Day5_Strings;

import java.util.Scanner;

public class VowelsChecker {

    
    public static int charType(char c) {
        char lower = Character.toLowerCase(c);
        if (lower >= 'a' && lower <= 'z') {
            if (lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u') {
                return 1;  // Vowel
            } else {
                return 2;  // Consonant
            }
        }
      return 0;
    }

   
    public static int[] countVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            int type = charType(input.charAt(i));
            if (type == 1) {
                vowelCount++;
            } else if (type == 2) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(userInput);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        
    }
}

