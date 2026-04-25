package linkedlist;

public class addinmiddle {
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
    public static void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void printlist(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addinmiddle(int idx,int data){
        node newnode=new node(data);
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void main(String args[]){
        addfirst(1);
        addfirst(2);
        addfirst(3);
        addinmiddle(1, 4);
        printlist();
    }
}
