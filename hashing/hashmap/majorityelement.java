//return the element that has the frequency greater than n/3
package hashing.hashmap;
import java.util.*;
public class majorityelement {
    public static void main(String args[]){
        int arr[]={1,2,3,1,4,1,1,3,3,3,3,3,3,3};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
}
