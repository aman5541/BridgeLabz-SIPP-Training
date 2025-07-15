class MyHashMap {
    class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }
    final int SIZE = 100;
    Node[] buckets = new Node[SIZE];

    int getIndex(int key) {
        return key % SIZE;
    }
    void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    Integer get(int key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    void remove(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev != null) prev.next = head.next;
                else buckets[index] = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
