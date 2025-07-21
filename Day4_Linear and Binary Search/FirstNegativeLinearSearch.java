public class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, -2, 5, -6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Index: " + i);
                return;
            }
        }
        System.out.println("No negative number found");
    }
}