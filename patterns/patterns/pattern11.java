package patterns;
import java.util.*;
class question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
       
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print("A*");
                
        }
        System.out.println();
    }
}
}
/*
enter the number of rows:6
     *
    *A*
   *A*A*
  *A*A*A*
 *A*A*A*A*
*A*A*A*A*A*


*/