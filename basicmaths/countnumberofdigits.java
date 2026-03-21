/*count number of digits in a number */
package basicmaths;
import java.util.*;
class countnumberofdigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("give the number:");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int lastdigit=n%10;
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
}