public class StringConcatComparison {
    public static void main(String[] args) {
        int n = 100_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long stringTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("a");
        long bufferTime = System.nanoTime() - start;

        System.out.println("String: " + stringTime / 1e6 + " ms");
        System.out.println("StringBuilder: " + builderTime / 1e6 + " ms");
        System.out.println("StringBuffer: " + bufferTime / 1e6 + " ms");
    }
}
