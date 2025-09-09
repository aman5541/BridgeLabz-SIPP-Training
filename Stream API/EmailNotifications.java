
import java.util.*;

public class EmailNotifications {
    static void sendEmailNotification(String email){
        System.out.println("Email sent to "+email);
    }
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@mail.com","b@mail.com","c@mail.com");
        emails.forEach(email->sendEmailNotification(email));
    }
}
