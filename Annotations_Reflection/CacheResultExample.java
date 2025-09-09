
import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult { }

class ExpensiveComputation {
    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int compute(int input) {
        if (cache.containsKey(input)) return cache.get(input);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        int result = input * input;
        cache.put(input, result);
        return result;
    }
}
