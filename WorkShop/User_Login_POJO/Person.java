package WorkShop.User_Login_POJO;

public abstract class Person {
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String email;
    protected String password;
    protected int age;
    protected String pincode;

    public Person(String name, String firstName, String lastName, String phoneNumber, String email, String password, int age, String pincode) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.age = age;
        this.pincode = pincode;
    }

    public abstract void displayInfo();
}