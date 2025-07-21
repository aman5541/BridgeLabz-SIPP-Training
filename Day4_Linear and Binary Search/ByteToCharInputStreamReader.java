
import java.io.*;

public class ByteToCharInputStreamReader {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"), "UTF-8"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
