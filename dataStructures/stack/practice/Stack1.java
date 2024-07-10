package practice;

public class Stack1 {
    int n;
    int[] arr;
    int top;

    Stack1(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top = -1;
    }

    public void push(int data) {
        if (top >= n - 1) {
            System.err.println("Stack if full");
            return;
        }

        arr[++top] = data;
    }

    public int pop() {
        if (top <= 0) {
            System.err.println("Stack is empty");
            return -1;
        }

        return arr[top--];
    }

    public int peek() {
        if (top < 0) {
            System.err.println("Stack is empty!");
            return -1;
        }

        return arr[top];
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);

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
