package recurssion;
/*
ou are given a floor of size 2 × n.

You have an unlimited number of tiles of size 2 × 1.

👉 Your task is to find the total number of ways to fill the entire floor using these tiles.
Conditions
Tiles can be placed:
Vertically (covers 1 column)
Horizontally (covers 2 columns)
Tiles must not overlap
The floor must be completely covered
Input
An integer n → length of the floor
Output
Return the total number of distinct ways to tile the floor */
public class tilingproblem {
    public static int totalways(int n){
        if(n==1||n==0){
            return 1;//n = 0 → 1 way (do nothing) OR n = 1 → 1 way (one vertical tile)
        }
        return totalways(n-1)+totalways(n-2);
    }
    public static void main(String args[]){
        System.out.println(totalways(3));
    }
}
