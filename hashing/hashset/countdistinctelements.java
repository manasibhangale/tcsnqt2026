package hashing.hashset;
import java.util.*;
public class countdistinctelements {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,2,3,4,6,7,7,8,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set.size());
    }
}
