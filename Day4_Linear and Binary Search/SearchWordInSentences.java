public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is easy",
            "C++ is fast"
        };
        String word = "easy";
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                System.out.println(sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}