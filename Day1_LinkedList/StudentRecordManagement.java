class StudentRecord {
    String rollNumber;
    String name;
    int age;
    char grade;
    StudentRecord next;

    StudentRecord(String rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    StudentRecord head;

    public void addAtBeginning(String roll, String name, int age, char grade) {
        StudentRecord newNode = new StudentRecord(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String roll, String name, int age, char grade) {
        StudentRecord newNode = new StudentRecord(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentRecord temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteByRoll(String roll) {
        if (head == null) return;
        if (head.rollNumber.equals(roll)) {
            head = head.next;
            return;
        }
        StudentRecord temp = head;
        while (temp.next != null && !temp.next.rollNumber.equals(roll)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void searchByRoll(String roll) {
        StudentRecord temp = head;
        while (temp != null) {
            if (temp.rollNumber.equals(roll)) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    public void updateGrade(String roll, char grade) {
        StudentRecord temp = head;
        while (temp != null) {
            if (temp.rollNumber.equals(roll)) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        StudentRecord temp = head;
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtEnd("101", "Alice", 20, 'A');
        list.addAtBeginning("102", "Bob", 21, 'B');
        list.addAtEnd("103", "Charlie", 22, 'C');
        list.display();
        list.updateGrade("102", 'A');
        list.searchByRoll("102");
        list.deleteByRoll("103");
        list.display();
    }
}