package geeksforgeeks.strings2;
import java.util.*;
public class romantonumber {
    public static int romantointeger(String str1){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum=0;
        for(int i=0;i<str1.length();i++){
            int curr=map.get(str1.charAt(i));
            if(i<str1.length()-1 && curr<map.get(str1.charAt(i+1))){
                sum-=curr;
            }else{
                sum+=curr;
            }
        }
        return sum;
    }
    public static void main (String args[]){
        String str1="MCMIV";
        System.out.println(romantointeger(str1));
    }
}
