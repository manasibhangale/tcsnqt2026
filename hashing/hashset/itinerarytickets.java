package hashing.hashset;
import java.util.*;
public class itinerarytickets {
    public static String getstart(HashMap<String,String> map){
        HashMap<String,String> revmap=new HashMap<>();
        for(String i:map.keySet()){
            revmap.put(map.get(i),i);
        }
        for(String i:map.keySet()){
            if(!revmap.containsKey(i)){
                return i;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String>map=new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");
        String start=getstart(map);
        System.out.print(start);
        for(String key:map.keySet()){
            System.out.print("==>"+map.get(start));
            start=map.get(start);
        }
    }
}
