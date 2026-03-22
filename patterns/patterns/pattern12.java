package patterns;
import java.util.*;
class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n - i - 1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+j-1);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(i+j-1);
            }
            System.out.println();
        }
    }
}
/*
enter the number of rows:6
    1
   232
  34543
 4567654
567898765
67891011109876
 */