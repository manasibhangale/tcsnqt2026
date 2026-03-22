package patterns;
import java.util.*;
class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(val+" ");
                val=val*(i-j)/(j+1);
        }
        System.out.println();
    }
}
}
/*
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
PASCAL'S TRIANGLE
 */