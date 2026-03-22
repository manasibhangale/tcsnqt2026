/*
floyd's triangle
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
 */
package patterns;
// Use this editor to write, compile and run your Java code online
import java.util.*;
class question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+ " ");
                val++;
        }
        System.out.println();
    }
}
}