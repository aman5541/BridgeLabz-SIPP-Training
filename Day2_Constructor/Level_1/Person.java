public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
       // System.out.println("Name: " + other.name + ", Age: " + other.age);
    }
    public static void main(String[] args) {
       
         Person p1 = new Person("Aman singh",21);
         Person p2 = new Person(p1);//copy constructor
         
          
          p1.printDetails();
         p2.printDetails();
    }
}

    

