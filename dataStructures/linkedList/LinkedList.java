public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 3);
        list = insert(list, 8);
        list = insert(list, 100);

        printList(list);
    }
}
