package geeksforgeeks.strings2;
import java.util.*;
public class stringduplicateremoval {
    
    public static void main(String args[]){
        String str1="GeEksforgEeks";
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();//hashset remove duplicates but gives ooutput in set format
        for(char ch:str1.toCharArray()){
            if(!set.contains(ch)){//adds only nonrepeating chars to the stringbuilder
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
    
}
