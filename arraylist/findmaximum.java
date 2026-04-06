package arraylist;
import java.util.*;

class findmaximum {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(list.get(i),max);
        }
        System.out.println("the maximum number in arraylist is: "+max);
    }
}
