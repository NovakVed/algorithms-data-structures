package practice;

class Queue3 {
    public static class Queue {
        int front, rear;
        int size;
        int[] queue;

        public Queue(int size) {
            this.size = size;
            this.queue = new int[size];
            front = rear = 0;
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

            for (int i = front; i < rear; i++)
                queue[i] = queue[i + 1];

            queue[rear--] = 0;
        }

        public void printFront() {
            if (front == rear) {
                System.err.println("Queue is empty!");
                return;
            }
            System.out.println(queue[front]);
        }

        public void printQueue() {
            if (front == rear) {
                System.err.println("Queue is empty!");
                return;
            }

            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5) {
            {
                enQueue(1);
                enQueue(2);
                enQueue(3);
            }
        };

        queue.deQueue();
        queue.deQueue();
        System.out.println("FRONT: ");
        queue.printFront();
        System.out.println("QUEUE: ");
        queue.printQueue();
    }
}
