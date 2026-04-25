package linkedlist;

public class sizeofll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class LinkedListCustom {
        Node head;
        Node tail;
        int size;

        // Add at beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Add at end
        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Print list
        public void printList() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
        public void addinmiddle(int idx,int data){
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){//helps find previous
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    }

    public static void main(String[] args) {
        LinkedListCustom list = new LinkedListCustom();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        list.printList();
        System.out.println(list.size);
    }
}


