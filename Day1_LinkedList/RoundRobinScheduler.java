public class RoundRobinScheduler {
    static class Process {
        int id, burstTime, priority;
        Process next;
        Process(int id, int burstTime, int priority) {
            this.id = id;
            this.burstTime = burstTime;
            this.priority = priority;
            this.next = null;
        }
    }

    Process head = null;

    void addProcess(int id, int bt, int pr) {
        Process p = new Process(id, bt, pr);
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    void simulate(int timeQuantum) {
        if (head == null) return;
        Process current = head;
        int totalTime = 0, waitingTime = 0, turnAroundTime = 0, count = 0;
        do {
            count++;
            current = current.next;
        } while (current != head);

        while (count > 0) {
            Process prev = null;
            current = head;
            do {
                if (current.burstTime > 0) {
                    int execTime = Math.min(current.burstTime, timeQuantum);
                    current.burstTime -= execTime;
                    totalTime += execTime;
                    if (current.burstTime == 0) {
                        waitingTime += totalTime;
                        turnAroundTime += totalTime;
                        count--;
                    }
                }
                prev = current;
                current = current.next;
            } while (current != head);
        }
        System.out.println("Avg Waiting Time: " + (waitingTime / 4.0));
        System.out.println("Avg Turnaround Time: " + (turnAroundTime / 4.0));
    }

    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();
        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 4, 2);
        rr.addProcess(3, 6, 1);
        rr.addProcess(4, 8, 3);
        rr.simulate(3);
    }
}