public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Reversed String: " + reversed);
    }
}
