
import java.time.*; 
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiry;
    Member(String name,LocalDate expiry){this.name=name;this.expiry=expiry;}
    public String toString(){return name+" expiring on "+expiry;}
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Sam",LocalDate.now().plusDays(10)),
            new Member("Tom",LocalDate.now().plusDays(40)),
            new Member("Anna",LocalDate.now().plusDays(20))
        );
        members.stream()
            .filter(m->m.expiry.isBefore(LocalDate.now().plusDays(30)))
            .forEach(System.out::println);
    }
}
