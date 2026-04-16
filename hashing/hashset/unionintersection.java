package hashing.hashset;
import java.util.*;
public class unionintersection {
    public static void main(String args[]){
        int arr1[]={7,2,9};
        int arr2[]={1,2,3,7,9};
        //union
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set.size());
        //intersection
        HashSet<Integer> set1=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                count++;
                set1.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
