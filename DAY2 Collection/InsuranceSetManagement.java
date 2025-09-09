import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsuranceSetManagement {
    public static void addSample(Set<Policy> set){
        set.add(new Policy("P100","Raj",LocalDate.now().plusDays(10),"Health",1200));
        set.add(new Policy("P101","Simran",LocalDate.now().plusDays(40),"Auto",2200));
        set.add(new Policy("P102","Aman",LocalDate.now().plusDays(5),"Home",1500));
        set.add(new Policy("P103","Deepa",LocalDate.now().plusDays(20),"Health",1800));
    }

    public static Set<Policy> findExpiringSoon(Collection<Policy> coll){
        Set<Policy> res = new HashSet<>();
        LocalDate now = LocalDate.now();
        for (Policy p : coll) if (!p.expiry.isBefore(now) && ChronoUnit.DAYS.between(now,p.expiry) <= 30) res.add(p);
        return res;
    }

    public static Set<Policy> filterByCoverage(Collection<Policy> coll, String coverage){
        Set<Policy> res = new HashSet<>();
        for (Policy p : coll) if (p.coverage.equalsIgnoreCase(coverage)) res.add(p);
        return res;
    }

    public static Set<String> duplicatePolicyNumbers(Collection<Policy> coll){
        Set<String> seen = new HashSet<>();
        Set<String> dup = new HashSet<>();
        for (Policy p : coll) if (!seen.add(p.number)) dup.add(p.number);
        return dup;
    }

    public static void performanceTest(){
        List<Policy> sample = new ArrayList<>();
        for (int i=0;i<5000;i++) sample.add(new Policy("PX"+i,"H"+i,LocalDate.now().plusDays(i%365),"Auto",100+i));
        Set<Policy> hs = new HashSet<>();
        Set<Policy> lhs = new LinkedHashSet<>();
        Set<Policy> ts = new TreeSet<>(Comparator.comparing(p->p.expiry));
        long t1 = System.nanoTime();
        for (Policy p: sample) hs.add(p);
        long t2 = System.nanoTime();
        for (Policy p: sample) lhs.add(p);
        long t3 = System.nanoTime();
        for (Policy p: sample) ts.add(p);
        long t4 = System.nanoTime();
        System.out.println("HashSet add: "+(t2-t1));
        System.out.println("LinkedHashSet add: "+(t3-t2));
        System.out.println("TreeSet add: "+(t4-t3));
        Policy probe = sample.get(2500);
        long s1=System.nanoTime(); hs.contains(probe); long s2=System.nanoTime();
        lhs.contains(probe); long s3=System.nanoTime();
        ts.contains(probe); long s4=System.nanoTime();
        System.out.println("HashSet contains: "+(s2-s1));
        System.out.println("LinkedHashSet contains: "+(s3-s2));
        System.out.println("TreeSet contains: "+(s4-s3));
    }

    public static void main(String[] args){
        Set<Policy> hash = new HashSet<>();
        Set<Policy> linked = new LinkedHashSet<>();
        Set<Policy> tree = new TreeSet<>(Comparator.comparing(p->p.expiry));
        addSample(hash); addSample(linked); addSample(tree);
        System.out.println("All unique (HashSet): "+hash);
        System.out.println("Expiring soon: "+findExpiringSoon(hash));
        System.out.println("Health policies: "+filterByCoverage(hash,"Health"));
        System.out.println("Duplicate policy numbers: "+duplicatePolicyNumbers(Arrays.asList(
            new Policy("P100","X",LocalDate.now(),"Auto",1000),
            new Policy("P100","Y",LocalDate.now(),"Auto",2000)
        )));
        performanceTest();
    }
}
