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
        // If array is empty → no common prefix
        if(strs==null||strs[0].length()==0) return "";
        //we will compare all the characters of the first string in the array with all the other string or elements present in the array
        for(int i=0;i<strs[0].length();i++){
            //in the first string of the array the character at the ith position
            char ch=strs[0].charAt(i);
            //j variable moves to all the elements in the array
            for(int j=0;j<strs.length;j++){
                //if i == strs[j].length() that means the whole string at j index is accepted
                //if strs[j].charAt(i)!=ch in the other elements of the array's same position char and first element of the array's same position char doesnt match then  enter the loop
                if(i==strs[j].length() || strs[j].charAt(i)!=ch){
                    //if it doesnt match (the first and the other elements same position char) then move inside the loop
                    //print the substring till it matches
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];//the whole first string is the prefix
    }
    public static void main(String args[]){
        String strs [ ]= {"flower","flow","flight"};
        System.out.println(prefix(strs));
    }
}
