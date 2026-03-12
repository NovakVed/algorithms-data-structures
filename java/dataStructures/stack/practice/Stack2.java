class Stack2 {
	static class Stack {
		private int n;
		private int[] arr;
		private int top;

		Stack(int n) {
			this.n = n;
			this.arr = new int[n];
			this.top = -1;
		}

		public void push(int value) {
			if (top >= n - 1) System.err.println("Stack is full");
			arr[++top] = value;
		}

		public int pop() {
			if (top > 0) System.err.println("Stack is empty");
			return arr[top--];
		}

		public int peek() {
			if (top > 0) System.err.println("Stack is empty");
			return arr[top];
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(10) {{
			push(1);
			push(2);
			push(3);
		}};
		stack.peek();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
