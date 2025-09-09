
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class BugManager {
    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Array index out of bounds")
    void bugMethod() throws Exception {
        Method m = this.getClass().getMethod("bugMethod");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport br : reports) {
            System.out.println("Bug: " + br.description());
        }
    }
}
