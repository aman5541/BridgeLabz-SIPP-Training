import java.util.*;

public class SearchPerformance {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        int target = n - 1;

        long start1 = System.currentTimeMillis();
        linearSearch(arr, target);
        long end1 = System.currentTimeMillis();
        System.out.println("Linear Search Time: " + (end1 - start1) + "ms");

        Arrays.sort(arr);
        long start2 = System.currentTimeMillis();
        binarySearch(arr, target);
        long end2 = System.currentTimeMillis();
        System.out.println("Binary Search Time: " + (end2 - start2) + "ms");
    }
}
