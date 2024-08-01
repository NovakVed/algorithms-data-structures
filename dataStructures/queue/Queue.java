public class Queue {
    private static int front, rear, capacity;
    private static int[] queue;

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    void enQueue(int item) {
        if (capacity == rear) {
            System.out.println("Queue is full!");
            return;
        }

        queue[rear++] = item;
    }

    void deQueue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        if (rear < capacity) {
            queue[rear] = 0;
        }

        rear--;
    }

    // print queue elements
    void queueDisplay() {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d , ", queue[i]);
        }
        return;
    }

    // print front of queue
    void queueFront() {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
        return;
    }

    public static void main(String[] args) {
        // Create a queue of capacity 4
        Queue q = new Queue(4);

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
        q.deQueue();
        System.out.printf("\nQueue after two dequeue operations:");

        // print Queue elements
        q.queueDisplay();

        // print front of the queue
        q.queueFront();
    }
}
