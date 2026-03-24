package string;
import java.util.*;
/*  Determine if 2 Strings areanagramsof each other.
What are anagrams?
If twostringscontain thesamecharactersbut inadifferentorder, theycanbesaidtobe
anagrams.Considerraceandcare. Inthiscase, race'scharacterscanbeformedintoastudy,
orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostrings
are anagrams or not.*/
public class anagram {
    public static boolean checkanagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        } 
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char [] sarray1=s1.toCharArray();
        char [] sarray2=s2.toCharArray();
        Arrays.sort(sarray1);
        Arrays.sort(sarray2);
        return Arrays.equals(sarray1,sarray2);
    }
    public static void main(String args[]){
        String s1="race";
        String s2="care";
        if (checkanagram(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
