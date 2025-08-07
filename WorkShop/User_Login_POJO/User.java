package WorkShop.User_Login_POJO;

import java.util.regex.Pattern;

public class User extends Person {

    public User(String name, String firstName, String lastName, String phoneNumber, String email, String password, int age, String pincode) {
        super(name, firstName, lastName, phoneNumber, email, password, age, pincode);
    }

    public boolean isValid() {
        return Pattern.matches("^[A-Za-z ]+$", name) &&
               Pattern.matches("^[A-Za-z]+$", firstName) &&
               Pattern.matches("^[A-Za-z]+$", lastName) &&
               Pattern.matches("^[0-9]{10}$", phoneNumber) &&
               Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", email) &&
               Pattern.matches("^(?=.[A-Z])(?=.[a-z])(?=.*\\d).{6,}$", password) &&
               age > 0 &&
               Pattern.matches("^[1-9][0-9]{5}$", pincode);
    }

    @Override
    public void displayInfo() {
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Pincode: " + pincode);
    }
}