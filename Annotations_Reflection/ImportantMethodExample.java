
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class ImportantMethodExample {
    @ImportantMethod(level = "CRITICAL")
    void firstImportant() { }

    @ImportantMethod
    void secondImportant() { }

    static void checkImportantMethods() throws Exception {
        for (Method m : ImportantMethodExample.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method " + m.getName() + " has level " + im.level());
            }
        }
    }
}
