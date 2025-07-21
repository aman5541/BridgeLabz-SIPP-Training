
import java.util.*;

public class SearchComparisonSimple {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) if (num == target) return true;
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return true;
            else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        int target = arr.length - 1;

        long start1 = System.currentTimeMillis();
        linearSearch(arr, target);
        long end1 = System.currentTimeMillis();
        System.out.println("Linear Search Time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        binarySearch(arr, target);
        long end2 = System.currentTimeMillis();
        System.out.println("Binary Search Time: " + (end2 - start2) + " ms");
    }
}
