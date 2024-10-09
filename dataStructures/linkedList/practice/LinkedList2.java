package practice;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(12);
        linkedList.insert(18);
        linkedList.insert(1);
        linkedList.insert(9);
        linkedList.insert(26);
        linkedList.insert(4);

        linkedList.printList();
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            this.head = null;
        }

        class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }
        }

        void insert(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null)
                currNode = currNode.next;

            currNode.next = newNode;
        }

        void printList() {
            int i = 0;
            Node currNode = head;
            while (currNode.next != null) {
                System.out.println("Position " + i++ + " : " + currNode.value);
                currNode = currNode.next;
            }
        }
    }
}
