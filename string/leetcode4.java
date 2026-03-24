package string;
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
  */
public class leetcode4 {
    class Solution {
    public int lengthOfLastWord(String s) {
        
        // Start from last index of string
        // len will store length of last word
        int i = s.length() - 1, len = 0;

        // Step 1: Skip all trailing spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') 
            i--;

        // Step 2: Count characters of last word
        // Continue until we hit a space or reach start
        while (i >= 0 && s.charAt(i) != ' ') { 
            len++;      // increase length count
            i--;        // move to previous character
        }

        // Step 3: Return length of last word
        return len;
    }
}
}
