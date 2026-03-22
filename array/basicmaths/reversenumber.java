/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
  */
package basicmaths;

public class reversenumber {
    public int reverse(int x) {
        int reverse=0;
        while(x!=0){
            int lastdigit=x%10;
            reverse=reverse*10+lastdigit;
            x=x/10;
        }
        return reverse;
    }

}
/*
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        
        while (x != 0) {
            int lastdigit = x % 10;
            x = x / 10;
            
            if (reverse > Integer.MAX_VALUE / 10 || 
               (reverse == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
            
            if (reverse < Integer.MIN_VALUE / 10 || 
               (reverse == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            
            reverse = reverse * 10 + lastdigit;
        }
        
        return reverse;
    }
} */