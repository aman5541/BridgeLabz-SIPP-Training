import java.util.*;

public class ChallengeLinearBinary {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int x : arr) if (x > 0) set.add(x);
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                System.out.println("First missing positive: " + i);
                break;
            }
        }

        Arrays.sort(arr);
        int target = 1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Target index: " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Target not found");
    }
}