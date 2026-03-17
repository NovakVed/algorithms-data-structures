class LinkedList:
    class Node:
        def __init__(self, value):
            self.value = value
            self.next = None
            
    def __init__(self):
        self.head = None # first node in the list

    def insert(self, data):
        new_node = self.Node(data)
        if self.head is None:
            self.head = new_node
            return
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
        current_node.next = new_node
    
    def remove(self):
        if self.head is None:
            print('Unable to remove empty linked list')
            return
        if self.head.next is None:
            self.head = None
            return
        self.head = self.head.next

    def printList(self):
        if self.head is None:
            print('Unable to print empty linked list')
            return
        current_node = self.head
        while current_node is not None:
            print(current_node.value)
            current_node = current_node.next

list = LinkedList()
list.insert(1)
list.insert(2)
list.insert(3)
list.insert(4)

list.printList()
