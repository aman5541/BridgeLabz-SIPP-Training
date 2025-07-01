import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Aman Singh");
        Doctor d2 = new Doctor("Harsh vardhan");

        Patient p1 = new Patient("Jay");
        Patient p2 = new Patient("Ayush");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);
    }
}
