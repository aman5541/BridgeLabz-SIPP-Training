
import java.io.*;

public class InputStreamReaderWriteToFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String line;
        while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
