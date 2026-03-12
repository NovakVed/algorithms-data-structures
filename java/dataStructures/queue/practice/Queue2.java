package practice;

class Queue2 {
	static class Queue {
		int front, rear, size;
		int arr[];

		Queue(int size) {
			this.size = size;
			arr = new int[size];
			front = rear = 0;
		}

		public void enQueue(int value) {
			if (rear == size) {
				System.err.println("Queue is full");
				return;
			}
			arr[rear++] = value;
		}

		public void deQueue() {
			if (front == rear) {
				System.err.println("Queue is empty");
				return;
			}

			for (int i = front; i < rear; i++)
				arr[i] = arr[i + 1];

			if (rear < size)
				arr[rear] = 0;
			rear--;
		}

		public void printFront() {
			if (front == rear) {
				System.err.println("Queue is empty");
				return;
			}
			System.out.println(arr[front]);
		}

		public void printQueue() {
			if (front == rear) {
				System.out.println("Queue is empty");
				return;
			}
			for (int i = front; i < rear; i++)
				System.out.print(i + ", ");
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
