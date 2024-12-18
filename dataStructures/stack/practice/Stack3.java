package practice;

public class Stack3 {

    public static void main(String[] args) {
        Stack stack = new Stack() {
            {
                push(1);
                push(2);
                push(3);
            }
        };
        try {
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
        stack.push(4);
        System.out.println(stack.pop());
    }

    static class Stack {
        private Node head;

        public void push(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }
            Node currentNode = head;
            newNode.next = currentNode;
            head = newNode;
        }

        public int pop() {
            if (head == null) {
                throw new IllegalStateException("Stack is empty");
            }

            int currValue = head.value;
            head = head.next;
            return currValue;
        }

        public int peek() {
            if (head == null) {
                throw new IllegalStateException("Stack is empty");
            }

            return head.value;
        }

        static class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
                this.next = null;
            }
        }
    }
}
