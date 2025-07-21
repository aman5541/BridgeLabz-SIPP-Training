
import java.io.*;

public class WordCountFileReader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        String word = "java";
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\s+");
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) count++;
            }
        }
        reader.close();
        System.out.println("Count: " + count);
    }
}
