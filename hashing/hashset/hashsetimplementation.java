package hashing.hashset;
import java.util.*;
public class hashsetimplementation {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.contains(2);
        set.contains(5);
        set.remove(2);
        System.out.println(set);
    }
}
