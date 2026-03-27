package recurssion;
/*
📌 Problem Statement: Friends Pairing Problem

Given n friends, each friend can either:

remain single, or
be paired up with exactly one other friend

👉 Find the total number of ways in which all friends can remain single or be paired up.

📐 Conditions
Each friend can be part of only one pair
A pair consists of exactly 2 friends
Order inside a pair doesn’t matter (pair (A,B) = (B,A))
📥 Input
Integer n → number of friends
📤 Output
Total number of valid pairing combinations */
public class friendspairing {
    public static int totalpair(int n){
        // 🔴 Base Case:
        // 0 friends → 1 way (do nothing)
        // 1 friend → 1 way (stay single)
        if (n==0||n==1) {
            return n;           
        }
        /*
        | Case   | Meaning                        | Formula        |
| ------ | ------------------------------ | -------------- |
| Single | Fix one friend as single       | `f(n-1)`       |
| Pair   | Pair with any of (n−1) friends | `(n-1)*f(n-2)` |
👍Stay single → reduce problem by 1
👍Make a pair → choose partner × reduce problem by 2
         */
        return totalpair(n-1)+((n-1)*totalpair(n-2));
    }
    public static void main(String args[]){
        System.out.println(totalpair(4));
    }
}
