package linkedlist;

public class removefirstfromll {
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
    static int size;
    public static void addfirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        
        newnode.next=head;
        head=newnode;
    }
    public static void addlastt(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        
        tail.next=newnode;
        tail=newnode;
    }
    public static void addinmiddle(int data, int idx){
    if(idx == 0){
        addfirst(data);
        return;
    }

    if(idx == size){   
        addlastt(data);
        return;
    }

    if(idx < 0 || idx > size){
        System.out.println("Invalid index");
        return;
    }

    node newnode = new node(data);
    node temp = head;

    for(int i = 0; i < idx - 1; i++){
        temp = temp.next;
    }

    newnode.next = temp.next;
    temp.next = newnode;
    size++;
}
     public static void printlist(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static int removefirst(){
        //int val=head.data;
        if(size==0){
            System.out.println("list is empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public static void main(String args[]){
        addfirst(1);
        addfirst(2);
        addfirst(3);
        addinmiddle(1, 4);
        printlist();
        removefirst();
        printlist();
    }
}
