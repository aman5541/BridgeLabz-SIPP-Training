import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int size = 1_000_000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) data[i] = i;
        int target = size - 1;
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (data[i] == target) break;
        }
        long linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        Arrays.binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search: " + linearTime / 1e6 + " ms");
        System.out.println("Binary Search: " + binaryTime / 1e6 + " ms");
    }
}
