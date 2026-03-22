package patterns;
import java.util.*;
class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=(2*i-1);j++){
                System.out.print(j);
            }
            for(int j=(2*i-2);j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
    1
   232
  34543
 4567654
567898765 */