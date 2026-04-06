package arraylist;
import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);//O(1) TC
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int element=list.get(2);
        System.out.println(element);//O(1) TC
        list.set(2,88);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}