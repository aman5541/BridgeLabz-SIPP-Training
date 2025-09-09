
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class TodoExample {
    @Todo(task = "Refactor code", assignedTo = "Bob")
    void todoMethodOne() { }

    @Todo(task = "Write tests", assignedTo = "Carol", priority = "HIGH")
    void todoMethodTwo() { }

    static void checkTodos() throws Exception {
        for (Method m : TodoExample.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + ", AssignedTo: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}
