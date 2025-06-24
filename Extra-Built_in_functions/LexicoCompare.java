public class LexicoCompare {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int minLen = Math.min(s1.length(), s2.length());
        boolean printed = false;
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(s1 + " comes before " + s2);
                printed = true;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(s2 + " comes before " + s1);
                printed = true;
                break;
            }
        }
        if (!printed) {
            if (s1.length() < s2.length())
                System.out.println(s1 + " comes before " + s2);
            else if (s1.length() > s2.length())
                System.out.println(s2 + " comes before " + s1);
            else
                System.out.println("Both are equal");
        }
    }
}
