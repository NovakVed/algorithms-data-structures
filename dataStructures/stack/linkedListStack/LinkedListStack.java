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

        public void add(int value) {
            Node newNode = new Node(value);
            if (isStackEmpty()) {
                head = newNode;
                return;
            }

            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
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

            int currentNodeValue = head.value;
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }

            return currentNodeValue;
        }

        public boolean isStackEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        var stack = new Stack() {
            {
                add(10);
                add(20);
                add(30);
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