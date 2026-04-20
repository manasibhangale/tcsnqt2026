/*
Q.
Given a string consisting of lowercase English letters, find the character that appears maximum number of times.
If multiple characters have the same highest frequency, return the lexicographically smallest character.

✅ Example-Based Question

Q.
Input: "aabbcc"
Output: 'a'

Explanation:
All characters have the same frequency (2), so return the smallest character lexicographically. */
package geeksforgeeks.strings2;

public class highestfrequencylexographically {
    public static char freqlexo(String s){
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;//a for index0 ,b for index 1 
        }
        int max=0;
        char res='a';
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                res=(char)(i+'a');
            }
        }
        return res;

    }
    public static void main(String args[]){
        String s="aabbcc";
        System.out.println(freqlexo(s));
    }
}
