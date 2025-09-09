import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsuranceMapManagement {
    public static Map<String,Policy> sampleMap(){
        Map<String,Policy> m = new HashMap<>();
        m.put("P100", new Policy("P100","Raj",LocalDate.now().plusDays(10),"Health",1200));
        m.put("P101", new Policy("P101","Simran",LocalDate.now().plusDays(40),"Auto",2200));
        m.put("P102", new Policy("P102","Aman",LocalDate.now().plusDays(5),"Home",1500));
        return m;
    }

    public static List<Policy> expiringWithin(Map<String,Policy> m,int days){
        List<Policy> res = new ArrayList<>();
        LocalDate now = LocalDate.now();
        for (Policy p : m.values()) if (!p.expiry.isBefore(now) && ChronoUnit.DAYS.between(now,p.expiry) <= days) res.add(p);
        return res;
    }

    public static List<Policy> policiesByHolder(Map<String,Policy> m,String holder){
        List<Policy> res = new ArrayList<>();
        for (Policy p : m.values()) if (p.holder.equalsIgnoreCase(holder)) res.add(p);
        return res;
    }

    public static void removeExpired(Map<String,Policy> m){
        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<String,Policy>> it = m.entrySet().iterator();
        while (it.hasNext()){
            if (it.next().getValue().expiry.isBefore(now)) it.remove();
        }
    }

    public static void main(String[] args){
        Map<String,Policy> hm = sampleMap();
        Map<String,Policy> lhm = new LinkedHashMap<>(hm);
        Map<LocalDate,Policy> tm = new TreeMap<>();
        for (Policy p : hm.values()) tm.put(p.expiry,p);
        System.out.println("Get by number P101: "+hm.get("P101"));
        System.out.println("Expiring within 30 days: "+expiringWithin(hm,30));
        System.out.println("Policies by Aman: "+policiesByHolder(hm,"Aman"));
        removeExpired(hm);
        System.out.println("After removing expired: "+hm);
    }
}
