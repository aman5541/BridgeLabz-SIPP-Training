package Day5_Inheritance;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " (Chef) is cooking dishes.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Ravi", 201);
        Worker waiter = new Waiter("Sunil", 202);
        chef.performDuties();
        waiter.performDuties();
    }
}
