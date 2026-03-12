public class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void traverseForward() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void traverseBackwards() {
        if (tail == null) {
            return;
        }

        Node current = tail;
        while (current != head) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertAtBeginning(data);
        } else {
            Node currentNode = head;
            int currentPosition = 1;
            while (currentNode != null && currentPosition < position) {
                currentNode = currentNode.next;
                currentPosition++;
            }

            if (currentNode.next != null) {
                newNode.next = currentNode.next;
                newNode.prev = currentNode.prev;
                currentNode.prev.next = newNode;
                currentNode.prev = newNode;
            } else {
                insertAtEnd(data);
            }
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtEnd(1);
        doublyLinkedList.insertAtEnd(2);
        doublyLinkedList.insertAtEnd(3);
        doublyLinkedList.insertAtEnd(4);
        doublyLinkedList.insertAtEnd(5);

        System.out.print("After insertion at tail: ");
        display(doublyLinkedList.head);

        System.out.print("After insertion at head: ");
        doublyLinkedList.insertAtBeginning(0);
        display(doublyLinkedList.head);

        doublyLinkedList.insertAtPosition(6, 2);
        System.out.print("After insertion at 2nd position: ");
        display(doublyLinkedList.head);
    }

}
