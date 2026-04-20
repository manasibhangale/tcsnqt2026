package geeksforgeeks.array2;
import java.util.*;
public class printreversenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        if(number==0){
            System.out.println(0);
            return;
        }
        while(number!=0){
            long digit=number%10;
            System.out.print(digit);
            number=number/10;   
        }
    }
}
