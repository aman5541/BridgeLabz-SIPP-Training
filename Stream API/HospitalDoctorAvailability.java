
import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableWeekend;
    Doctor(String name,String specialty,boolean availableWeekend){this.name=name;this.specialty=specialty;this.availableWeekend=availableWeekend;}
    public String toString(){return name+" - "+specialty;}
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("John","Cardiology",true),
            new Doctor("Alice","Neurology",false),
            new Doctor("Bob","Orthopedics",true)
        );
        doctors.stream()
            .filter(d->d.availableWeekend)
            .sorted(Comparator.comparing(d->d.specialty))
            .forEach(System.out::println);
    }
}
