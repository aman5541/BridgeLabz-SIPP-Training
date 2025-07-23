package Day1JavaGenerics;

import java.util.*;

abstract class JobRole {
    String roleName;
    public JobRole(String roleName) { this.roleName = roleName; }
    public abstract void evaluate();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("Software Engineer"); }
    public void evaluate() { System.out.println("Evaluating: " + roleName); }
}

class DataScientist extends JobRole {
    public DataScientist() { super("Data Scientist"); }
    public void evaluate() { System.out.println("Evaluating: " + roleName); }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Product Manager"); }
    public void evaluate() { System.out.println("Evaluating: " + roleName); }
}

class Resume<T extends JobRole> {
    private T job;
    public Resume(T job) { this.job = job; }
    public void process() { job.evaluate(); }
}

class ScreeningUtil {
    public static void screenAll(List<? extends JobRole> roles) {
        for (JobRole r : roles) r.evaluate();
    }
}

class MainResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> se = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> ds = new Resume<>(new DataScientist());
        Resume<ProductManager> pm = new Resume<>(new ProductManager());

        se.process();
        ds.process();
        pm.process();

        List<JobRole> jobs = Arrays.asList(new SoftwareEngineer(), new ProductManager(), new DataScientist());
        ScreeningUtil.screenAll(jobs);
    }
}