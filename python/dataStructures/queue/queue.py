class Queue:
    class Node:
        def __init__(self, value):
            self.value = value
            self.next = None
    
    def __init__(self):
        self.head = None
    
    def enqueue(self, value):
        new_node = self.Node(value)
        if self.head is None:
            self.head = new_node
            return
        current_node = self.head
        while current_node.next is not None: 
            current_node = current_node.next
        current_node.next = new_node

    def deque(self):
        if self.head is None:
            print('Queue is already empty')
            return
        value = self.head.value
        self.head = self.head.next
        print(value)
    
    def printQueue(self):
        if self.head is None:
            print('Queue is already empty')
        current_node = self.head
        while current_node is not None:
            print(f"{current_node.value} -> ", end="")
            current_node = current_node.next

queue = Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
queue.enqueue(4)

print(queue.deque())
queue.printQueue()
