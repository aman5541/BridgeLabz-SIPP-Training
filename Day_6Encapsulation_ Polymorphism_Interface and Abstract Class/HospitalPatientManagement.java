abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();
    public String getPatientDetails() {
        return name + " (Age: " + age + ")";
    }
}

class InPatient extends Patient {
    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }
    public double calculateBill() { return 5000; }
}

class OutPatient extends Patient {
    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }
    public double calculateBill() { return 1500; }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P01", "Raj", 45),
            new OutPatient("P02", "Maya", 30)
        };
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails() + " | Bill: ₹" + p.calculateBill());
        }
    }
}