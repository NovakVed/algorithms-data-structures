import java.util.LinkedList;

class LinkedList1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static LinkedList1 insert(LinkedList1 list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node currNode = list.head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        return list;
    }

    public static void printList(LinkedList1 list) {
        Node currNode = list.head;
        while (currNode.next != null) {
            System.out.print(currNode.data);
            if (currNode.next.next != null) {
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();
        insert(linkedList, 12);
        insert(linkedList, 18);
        insert(linkedList, 1);
        insert(linkedList, 9);
        insert(linkedList, 26);
        insert(linkedList, 4);

        printList(linkedList);
    }

}
