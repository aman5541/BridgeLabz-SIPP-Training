
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime { }

class LogExample {
    @LogExecutionTime
    void fastMethod() throws Exception {
        long start = System.nanoTime();
        Thread.sleep(50);
        long end = System.nanoTime();
        System.out.println("fastMethod took " + (end - start) + " ns");
    }

    @LogExecutionTime
    void slowMethod() throws Exception {
        long start = System.nanoTime();
        Thread.sleep(100);
        long end = System.nanoTime();
        System.out.println("slowMethod took " + (end - start) + " ns");
    }
}
