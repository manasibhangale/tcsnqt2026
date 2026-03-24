package string;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
  */
public class leetcode3 {
    public static String prefix(String strs[]){
        if(strs==null||strs[0].length()==0) return "";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String args[]){
        String strs [ ]= {"flower","flow","flight"};
        System.out.println(prefix(strs));
    }
}
