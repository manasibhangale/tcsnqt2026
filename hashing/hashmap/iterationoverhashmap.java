package hashing.hashmap;

import java.util.*;
public class iterationoverhashmap {
    public static void main(String args[]){
         HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",100);
        hm.put("bhutan",20);
        hm.put("usa",50);
        hm.put("china",150);
        System.out.println(hm);
        Set <String> keys=hm.keySet();
        System.out.println(keys);
        for(String k:keys){
            System.out.println("key= "+k+" value= "+hm.get(k));
        }
    }
}
