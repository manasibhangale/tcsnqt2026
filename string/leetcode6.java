/*
Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.

It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.

Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.

Example 1:

Input: s = "?zs"
Output: "azs"
Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
Example 2:

Input: s = "ubv?w"
Output: "ubvaw"
Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww". */
class Solution {
    public String modifyString(String s) {
        
        // Convert string to character array since String is immutable
        char[] arr = s.toCharArray();

        // Traverse each character of the array
        for (int i = 0; i < arr.length; i++) {

            // Process only '?' characters
            if (arr[i] == '?') {

                // Try replacing '?' with letters from 'a' to 'z'
                for (char ch = 'a'; ch <= 'z'; ch++) {

                    // Check if current character matches previous character
                    // If yes, skip this character to avoid repetition
                    if (i > 0 && arr[i - 1] == ch) continue;

                    // Check if current character matches next character
                    // If yes, skip this character to avoid repetition
                    if (i < arr.length - 1 && arr[i + 1] == ch) continue;

                    // If both conditions are satisfied, assign the character
                    arr[i] = ch;

                    // Stop checking further characters once a valid one is found
                    break;
                }
            }
        }

        // Convert modified character array back to string and return
        return new String(arr);
    }
}
/*
Input
s = "?az"
🔷 Step 1
char[] arr = s.toCharArray();

👉

arr = ['?', 'a', 'z']
🔷 Step 2: Outer Loop
for (int i = 0; i < arr.length; i++)
👉 Iteration 1: i = 0
if (arr[i] == '?')

👉 arr[0] = '?' → ✅ TRUE

🔷 Inner Loop starts
for (char ch = 'a'; ch <= 'z'; ch++)
🔸 Try ch = 'a'
if (i > 0 && arr[i - 1] == ch) continue;
i = 0 → i > 0 ❌ FALSE
👉 skip this condition
if (i < arr.length - 1 && arr[i + 1] == ch) continue;
i < 2 ✅ TRUE
arr[1] = 'a'
'a' == 'a' ✅ TRUE

👉 continue executes
➡️ Skip 'a'

🔸 Try ch = 'b'
if (i > 0 && arr[i - 1] == ch) continue;
FALSE → skip
if (i < arr.length - 1 && arr[i + 1] == ch) continue;
arr[1] = 'a'
'a' == 'b' ❌ FALSE

✅ Valid character found

arr[i] = ch;

👉

arr = ['b', 'a', 'z']
break;

👉 Exit inner loop

👉 Iteration 2: i = 1
if (arr[i] == '?')

👉 arr[1] = 'a' → ❌ FALSE
➡️ Skip

👉 Iteration 3: i = 2
if (arr[i] == '?')

👉 arr[2] = 'z' → ❌ FALSE
➡️ Skip

🔷 Final Step
return new String(arr);

👉

"baz"
✅ Final Output
"baz"
 */