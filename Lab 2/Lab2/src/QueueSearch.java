public class QueueSearch { //Problem 5
public static boolean find(Queue q, int n) {
        boolean found = false;

        while (!q.isEmpty()) {
            int temp = q.dequeue();
            if (temp == n) {
                found = true;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(find(q, 20)); 
    }
}

