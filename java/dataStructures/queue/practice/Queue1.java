package practice;

public class Queue1 {
    private int rear, front, size;
    private int[] queue;

    Queue1(int size) {
        this.size = size;
        this.rear = this.front = 0;
        this.queue = new int[size];
    }

    public void enQueue(int data) {
        if (rear >= size) {
            System.err.println("Queue is full!");
            return;
        }

        queue[rear++] = data;
    }

    public void deQueue() {
        if (front == rear) {
            System.err.println("Queue is empty!");
            return;
        }

        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        if (rear < size) {
            queue[rear] = 0;
        }

        rear--;
    }

    public void queueFront() {
        if (front == rear) {
            System.err.println("Queue is empty!");
            return;
        }

        System.out.println("front: " + queue[front]);
    }

    public void queueDisplay() {
        if (front == rear) {
            System.err.println("Queue is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.printf(" %d, ", queue[i]);
        }
    }

    public static void main(String[] args) {
        // Create a queue of capacity 4
        Queue1 q = new Queue1(4);

        System.out.println("Initial Queue:");
        // print Queue elements
        q.queueDisplay();

        // inserting elements in the queue
        q.enQueue(10);
        q.enQueue(30);
        q.enQueue(50);
        q.enQueue(70);

        // print Queue elements
        System.out.println("Queue after Enqueue Operation:");
        q.queueDisplay();

        // print front of the queue
        q.queueFront();

        // insert element in the queue
        q.enQueue(90);

        // print Queue elements
        q.queueDisplay();

        q.deQueue();
        q.deQueue();
        System.out.printf("\nQueue after two dequeue operations:");

        // print Queue elements
        q.queueDisplay();

        // print front of the queue
        q.queueFront();
    }
}
