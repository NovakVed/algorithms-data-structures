class LinkedListStack {
    static class Stack {
        Node head;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        public int peek() {
            if (isStackEmpty()) {
                System.err.println("Stack is empty");
                return -1;
            }
            return head.value;
        }

        public int pop() {
            if (isStackEmpty()) {
                System.err.println("Stack is empty");
                return -1;
            }

            int value = head.value;
            head = head.next;
            return value;
        }

        public boolean isStackEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        var stack = new Stack() {
            {
                push(10);
                push(20);
                push(30);
            }
        };

        System.out.println("Peek:" + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
    }
}