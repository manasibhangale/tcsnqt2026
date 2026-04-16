package hashing.hashset;
import java.util.*;
public class hashsetiteration {
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("mumbai");
        cities.add("pune");
        cities.add("bengaluru");
        cities.add("indore");
        cities.add("hyderabad");
        cities.add("noida");
        //type 1====>
        System.out.println("using type 1:");
        Iterator it=cities.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        //type 2=====>
            System.out.println("using type 2:");
            for(String city:cities){
                
                System.out.println(city);
            }
    }
}
