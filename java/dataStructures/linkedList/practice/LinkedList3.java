public class LinkedList3 {
    Node head;

    public static LinkedList3 add(LinkedList3 list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
            return list;
        }
        Node currNode = list.head;
        while (currNode.next != null)
            currNode = currNode.next;

        currNode.next = newNode;
        return list;
    }

    public static void printList(LinkedList3 list) {
        Node head = list.head;
        if (head == null) {
            System.err.println("List is empty");
            return;
        }

        while (head.next != null) {
            head = head.next;
            System.out.print("[" + head.value + "] -> ");
        }
        return;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList3 linkedList = new LinkedList3();
        add(linkedList, 12);
        add(linkedList, 18);
        add(linkedList, 1);
        add(linkedList, 9);
        add(linkedList, 26);
        add(linkedList, 4);
        printList(linkedList);
    }
}
