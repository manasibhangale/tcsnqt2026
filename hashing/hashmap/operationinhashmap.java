package hashing.hashmap;
import java.util.*;
public class operationinhashmap {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",100);
        hm.put("bhutan",20);
        hm.put("usa",50);
        hm.put("china",150);
        System.out.println(hm);
        hm.put("india",120);
        System.out.println(hm);
        System.out.println(hm.get("india"));
        System.out.println(hm.get("usa"));
        hm.remove("china");
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("china"));
        System.out.println(hm.size());
    }
}
