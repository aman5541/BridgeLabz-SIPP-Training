package Day5_Strings;
public class NullPointerDemo {
    public static void generateNPE() {
        String text = null;
        System.out.println(text.length());  // Will throw NullPointerException
    }
    public static void handleNPE() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleNPE(); 
    }
}
