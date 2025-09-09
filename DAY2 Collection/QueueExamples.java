import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExamples {
    public static <T> Queue<T> reverseQueue(Queue<T> q) {
        if (q.isEmpty()) return q;
        T x = q.remove();
        Queue<T> res = reverseQueue(q);
        res.add(x);
        return res;
    }

    public static List<String> generateBinary(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i=0;i<n;i++) {
            String s = q.remove();
            res.add(s);
            q.add(s+"0");
            q.add(s+"1");
        }
        return res;
    }

    static class Patient implements Comparable<Patient>{
        String name;
        int severity;
        Patient(String n,int s){name=n;severity=s;}
        public int compareTo(Patient o){return Integer.compare(o.severity,this.severity);}
        public String toString(){return name;}
    }

    static class StackUsingQueues {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        public void push(int x){ q1.add(x); while(!q2.isEmpty()) q1.add(q2.remove()); Queue<Integer> t=q1; q1=q2; q2=t; }
        public int pop(){ return q2.remove(); }
        public int top(){ return q2.peek(); }
        public boolean empty(){ return q2.isEmpty(); }
    }

    static class CircularBuffer {
        int[] buf;
        int size;
        int start=0;
        int count=0;
        CircularBuffer(int s){ size=s; buf=new int[s]; }
        public void insert(int x){
            if (count < size){
                buf[(start+count)%size]=x;
                count++;
            } else {
                buf[start]=x;
                start=(start+1)%size;
            }
        }
        public List<Integer> contents(){
            List<Integer> res = new ArrayList<>();
            for (int i=0;i<count;i++) res.add(buf[(start+i)%size]);
            return res;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println(reverseQueue(new LinkedList<>(q)));
        System.out.println(generateBinary(5));
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));
        while(!pq.isEmpty()) System.out.print(pq.remove()+" ");
        System.out.println();
        StackUsingQueues s = new StackUsingQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1); cb.insert(2); cb.insert(3); cb.insert(4);
        System.out.println(cb.contents());
    }
}
