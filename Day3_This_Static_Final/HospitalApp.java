class Patient {
    static String hospitalName = "Global Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }
}
public class HospitalApp {
    public static void main(String[] args) {
        Patient p1 = new Patient(201, "Arjun", 45, "Fever");
        Patient p2 = new Patient(202, "Sneha", 30, "Cough");
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
