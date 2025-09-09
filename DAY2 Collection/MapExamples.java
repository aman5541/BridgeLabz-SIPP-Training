import java.util.*;
import java.util.stream.Collectors;

public class MapExamples {
    public static Map<String,Integer> wordFrequency(String text) {
        Map<String,Integer> map = new HashMap<>();
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9\s]"," ");
        for (String w : cleaned.split("\s+")) if (!w.isEmpty()) map.put(w, map.getOrDefault(w,0)+1);
        return map;
    }

    public static <K,V> Map<V,List<K>> invertMap(Map<K,V> map) {
        Map<V,List<K>> res = new HashMap<>();
        for (Map.Entry<K,V> e : map.entrySet()) {
            res.computeIfAbsent(e.getValue(), k->new ArrayList<>()).add(e.getKey());
        }
        return res;
    }

    public static <K> K keyWithMaxValue(Map<K,Integer> map) {
        K best = null;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<K,Integer> e : map.entrySet()) if (e.getValue() > max) { max = e.getValue(); best = e.getKey(); }
        return best;
    }

    public static <K> Map<K,Integer> mergeMaps(Map<K,Integer> a, Map<K,Integer> b) {
        Map<K,Integer> res = new HashMap<>(a);
        for (Map.Entry<K,Integer> e : b.entrySet()) res.put(e.getKey(), res.getOrDefault(e.getKey(),0)+e.getValue());
        return res;
    }

    static class Employee { String name; String dept; Employee(String n,String d){name=n;dept=d;} public String toString(){return name;} }

    public static Map<String,List<Employee>> groupByDept(List<Employee> list) {
        Map<String,List<Employee>> res = new HashMap<>();
        for (Employee e : list) res.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(wordFrequency("Hello world, hello Java!"));
        Map<String,Integer> m = new HashMap<>();
        m.put("A",1); m.put("B",2); m.put("C",1);
        System.out.println(invertMap(m));
        Map<String,Integer> m2 = new HashMap<>(); m2.put("A",10); m2.put("B",20); m2.put("C",15);
        System.out.println(keyWithMaxValue(m2));
        Map<String,Integer> x = new HashMap<>(); x.put("A",1); x.put("B",2);
        Map<String,Integer> y = new HashMap<>(); y.put("B",3); y.put("C",4);
        System.out.println(mergeMaps(x,y));
        List<Employee> emps = Arrays.asList(new Employee("Alice","HR"), new Employee("Bob","IT"), new Employee("Carol","HR"));
        System.out.println(groupByDept(emps));
    }
}
