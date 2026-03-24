package string;
import java.util.*;
public class countlowercasevowels {
    public static void countlowervowels(String s){
        int count=0;
        String vowels="aeiou";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(s.charAt(i)==(vowels.charAt(j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.next();
        countlowervowels(s);
        
    }
}
