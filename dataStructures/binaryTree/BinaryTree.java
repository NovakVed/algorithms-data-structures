import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void printBreathFirst() {
        if (root == null) {
            System.out.println("Binary tree is empty");
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node currentNode = nodes.poll();
            System.out.printf("%d ", currentNode.value);

            if (currentNode.left != null) {
                nodes.add(currentNode.left);
            }
            if (currentNode.right != null) {
                nodes.add(currentNode.right);
            }
        }
    }

    public void printDepthFirst() {
        if (root == null) {
            System.out.println("Binary tree is empty");
        }

        traverseInOrder(root);
    }

    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        bt.printBreathFirst();
        System.out.println("\n\nNEXT\n");
        bt.printDepthFirst();
    }
}
