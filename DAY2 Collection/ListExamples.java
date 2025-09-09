import java.util.*;
import java.util.stream.Collectors;

public class ListExamples {
    public static List<Integer> reverseArrayList(List<Integer> list) {
        List<Integer> res = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) res.add(list.get(i));
        return res;
    }

    public static List<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> res = new LinkedList<>();
        Iterator<Integer> it = list.descendingIterator();
        while (it.hasNext()) res.add(it.next());
        return res;
    }

    public static Map<String, Integer> frequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) map.put(s, map.getOrDefault(s, 0) + 1);
        return map;
    }

    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return new ArrayList<>();
        k = ((k % n) + n) % n;
        List<T> res = new ArrayList<>(n);
        for (int i = k; i < n; i++) res.add(list.get(i));
        for (int i = 0; i < k; i++) res.add(list.get(i));
        return res;
    }

    public static <T> List<T> removeDuplicatesPreserveOrder(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> res = new ArrayList<>();
        for (T e : list) if (seen.add(e)) res.add(e);
        return res;
    }

    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();
        int count = 0;
        while (count < n && fast.hasNext()) { fast.next(); count++; }
        while (fast.hasNext()) { fast.next(); slow.next(); }
        return slow.hasNext() ? slow.next() : null;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        System.out.println(reverseArrayList(a));
        LinkedList<Integer> ll = new LinkedList<>(a);
        System.out.println(reverseLinkedList(ll));
        List<String> fruits = Arrays.asList("apple","banana","apple","orange");
        System.out.println(frequency(fruits));
        List<Integer> nums = Arrays.asList(10,20,30,40,50);
        System.out.println(rotate(nums,2));
        List<Integer> dup = Arrays.asList(3,1,2,2,3,4);
        System.out.println(removeDuplicatesPreserveOrder(dup));
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(nthFromEnd(letters,2));
    }
}
