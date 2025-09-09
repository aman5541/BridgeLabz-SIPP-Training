
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = 1, assignedTo = "Alice")
    void taskMethod() throws Exception {
        Method m = this.getClass().getMethod("taskMethod");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority() + ", Assigned To: " + info.assignedTo());
    }
}
