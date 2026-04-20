package geeksforgeeks.hashmap;
import java.util.*;
public class removeduplicatesfromunsortedarray {
    public  static void removedup(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,4,5,6,4,5,8};
        removedup(arr);
    }
}
