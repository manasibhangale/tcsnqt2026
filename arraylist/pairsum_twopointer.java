package arraylist;

import java.util.ArrayList;

public class pairsum_twopointer {
    public static boolean is_pair(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else if(list.get(lp)+list.get(rp)>target){
                rp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=9;
        System.out.println(is_pair(list,target));
    }
}
