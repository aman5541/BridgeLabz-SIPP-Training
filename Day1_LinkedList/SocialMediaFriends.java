import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaFriends {
    User head = null;

    void addUser(int id, String name, int age) {
        User user = new User(id, name, age);
        if (head == null) head = user;
        else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = user;
        }
    }

    void addFriend(int uid1, int uid2) {
        User u1 = findUser(uid1), u2 = findUser(uid2);
        if (u1 != null && u2 != null && !u1.friends.contains(uid2)) {
            u1.friends.add(uid2);
            u2.friends.add(uid1);
        }
    }

    User findUser(int uid) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == uid) return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayFriends(int uid) {
        User user = findUser(uid);
        if (user != null) System.out.println("Friends of " + user.name + ": " + user.friends);
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();
        sm.addUser(1, "Alice", 21);
        sm.addUser(2, "Bob", 22);
        sm.addUser(3, "Charlie", 20);
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.displayFriends(1);
    }
}