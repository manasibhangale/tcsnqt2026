package linkedlist;
public class recursivesearch {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive function to find index of key
    public static int search(Node head, int key) {
        // Base case
        if (head == null) {
            return -1;
        }

        // If key found at current node
        if (head.data == key) {
            return 0;
        }

        // Recursive call
        int index = search(head.next, key);

        // If not found in rest of list
        if (index == -1) {
            return -1;
        }

        // Add 1 to index
        return index + 1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;

        int result = search(head, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}