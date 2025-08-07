package WorkShop.User_Login_POJO;

public class Main {
    public static void main(String[] args) {
        User user = new User(
            "Aman Singh",
            "Aman",
            "Singh",
            "97655677655",
            "siaman2323@gmail.com",
            "Amna@123",
            21,
            "281406"
        );

        if (user.isValid()) {
            user.displayInfo();
        } else {
            System.out.println("Invalid user details. Please check the fields.");
        }

        Login login = new Login("jatin@example.com", "Pass123");
        System.out.println("Login Email: " + login.getEmail());
    }
}
