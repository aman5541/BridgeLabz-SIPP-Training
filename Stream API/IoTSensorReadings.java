
import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45,78,62,90,30);
        readings.stream().filter(r->r>60).forEach(System.out::println);
    }
}
