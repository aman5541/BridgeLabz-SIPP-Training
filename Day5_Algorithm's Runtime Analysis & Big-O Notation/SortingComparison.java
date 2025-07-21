import java.util.*;

public class SortingComparison {
    public static void main(String[] args) {
        int size = 10_000;
        int[] arr1 = new Random().ints(size, 0, size).toArray();
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        long start = System.nanoTime();
        bubbleSort(arr1);
        long bubbleTime = System.nanoTime() - start;

        start = System.nanoTime();
        Arrays.sort(arr2); 
        long mergeTime = System.nanoTime() - start;

        Integer[] boxed = Arrays.stream(arr3).boxed().toArray(Integer[]::new);
        start = System.nanoTime();
        Arrays.sort(boxed); 
        long quickTime = System.nanoTime() - start;

        System.out.println("Bubble Sort: " + bubbleTime / 1e6 + " ms");
        System.out.println("Merge Sort: " + mergeTime / 1e6 + " ms");
        System.out.println("Quick Sort: " + quickTime / 1e6 + " ms");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
    }
}
