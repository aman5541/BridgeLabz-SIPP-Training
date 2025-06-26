public class OnlineCourseManagement {
    private String courseName;
    private int durationInWeeks; 
    private double fee;

    
    private static String instituteName = "Default Institute";

    
    public OnlineCourseManagement(String courseName, int durationInWeeks, double fee) {
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.fee = fee;
    }

   
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationInWeeks + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

