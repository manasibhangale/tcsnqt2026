package linkedlist;
public class addlastinll{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static node head;
        static node tail;
    
        public static void addlast(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static void printlist(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String args[]){
        addlast(1);
        addlast(2);
        addlast(3);
        printlist();
    }
}