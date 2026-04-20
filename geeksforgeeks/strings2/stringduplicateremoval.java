package geeksforgeeks.strings2;
import java.util.*;
public class stringduplicateremoval {
    
    public static void main(String args[]){
        String str1="GeEksforgEeks";
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(char ch:str1.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
    
}
