package Day5_Inheritance;

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    int discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, int discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 8, "Udemy", true, 4999, 20);
        poc.displayDetails();
    }
}
