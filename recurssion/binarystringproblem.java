package recurssion;
/*
Problem Statement

Generate all binary strings of length n where:

Only 0 and 1 are allowed
No two consecutive 1s
 */
public class binarystringproblem {
    public static void noadjacent1(int n, int lastbit,String str){
        // 🔴 Base Case:
        // If length becomes 0 → print the constructed string
        if(n==0){
            System.out.println(str);
            return;
        }
        // ✅ Always allowed to place '0'
        // After placing '0', lastbit becomes 0
        noadjacent1(n-1, 0, str+"0");
          // ⚠️ Place '1' ONLY if previous bit was 0
        if(lastbit==0){
            // 🔥 IMPORTANT:
            // str + "1" → we are adding '1' to the string
            // So lastbit MUST be updated to 1 for next call
            // This tells next recursion: "last placed bit was 1"
            noadjacent1(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        noadjacent1(3, 0, "");
    }
}
