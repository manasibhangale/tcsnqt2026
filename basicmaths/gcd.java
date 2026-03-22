package basicmaths;
import java.util.*;
public class gcd {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int n1=sc.nextInt();
        System.out.print("Enter the number 2:");
        int n2=sc.nextInt();
        for(int i=Math.min(n1, n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}
