import java.util.*;
import java.util.stream.Collectors;

public class SetExamples {
    public static <T> boolean setsEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> res = new HashSet<>(a);
        res.addAll(b);
        return res;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> res = new HashSet<>(a);
        res.retainAll(b);
        return res;
    }

    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
        Set<T> res = new HashSet<>(a);
        for (T e : b) if (!res.remove(e)) res.add(e);
        return res;
    }

    public static List<Integer> setToSortedList(Set<Integer> s) {
        List<Integer> res = new ArrayList<>(s);
        Collections.sort(res);
        return res;
    }

    public static <T> boolean isSubset(Set<T> small, Set<T> big) {
        return big.containsAll(small);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(setsEqual(s1,s2));
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println(union(a,b));
        System.out.println(intersection(a,b));
        System.out.println(symmetricDifference(a,b));
        Set<Integer> input = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println(setToSortedList(input));
        System.out.println(isSubset(new HashSet<>(Arrays.asList(2,3)), new HashSet<>(Arrays.asList(1,2,3,4))));
    }
}
