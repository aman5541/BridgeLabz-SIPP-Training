public class SubstringCount {
    public static void main(String[] args) {
        String str = "hellohellohello";
        String sub = "lo";
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
