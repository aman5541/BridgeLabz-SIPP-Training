
import java.util.*;

public class EventAttendeeWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("John","Alice","Bob");
        attendees.forEach(a->System.out.println("Welcome "+a));
    }
}
