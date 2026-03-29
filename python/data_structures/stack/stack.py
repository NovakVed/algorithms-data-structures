class Stack:
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None
    
    def __init__(self):
        self.head = None
    
    def push(self, data):
        new_node = self.Node(data)
        new_node.next = self.head
        self.head = new_node 
    
    def pop(self):
        if self.head is None:
            print('Stack is already empty')
            return
        value = self.head.data
        self.head = self.head.next
        return value

    def print_stack(self):
        if self.head is None:
            print('Stack is empty')
            return
        current_node = self.head
        while current_node is not None:
            print(f"{current_node.data} -> ", end="")
            current_node = current_node.next

stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)

print(stack.print_stack())
print(stack.pop())
print(stack.print_stack())