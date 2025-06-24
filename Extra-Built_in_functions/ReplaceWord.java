public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        String wordToReplace = "Java";
        String replacement = "Python";
        String result = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(wordToReplace))
                result += replacement + " ";
            else
                result += word + " ";
        }
        System.out.println("Modified Sentence: " + result.trim());
    }
}
