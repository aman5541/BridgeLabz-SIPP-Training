
import java.io.*;

public class FileReadEfficiency {
    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt";

        long start1 = System.currentTimeMillis();
        FileReader fr = new FileReader(filePath);
        while (fr.read() != -1) {}
        fr.close();
        long end1 = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        while (isr.read() != -1) {}
        isr.close();
        long end2 = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end2 - start2) + "ms");
    }
}
