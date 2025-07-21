
import java.io.*;

public class FileReaderLineByLine {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
