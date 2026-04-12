package arraylist;
import java.util.*;
public class pairsum_rotatedarr_2pointer {
    public static boolean is_pair(ArrayList<Integer> list,int target){
        int rp=-1,lp=-1,n=list.size();
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                rp=i;
                lp=i+1;
            }
        }
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else if(list.get(lp)+list.get(rp)>target){
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList <Integer> list= new ArrayList<>();
        list.add(15);
        list.add(21);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=18;
        System.out.println(is_pair(list,target));
    }
}
