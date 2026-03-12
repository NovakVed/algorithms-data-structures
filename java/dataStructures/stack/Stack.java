class Stack {
    int n;
    int[] arr;
    int top;

    Stack(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top = -1;
    }

    public void push(int pushedElement) {
        if (top >= n - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = pushedElement;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}