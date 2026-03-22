package basicmaths;
import java.util.*;
class alldivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int counter=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                
                counter++;
            }
            if(n/i!=i){
                
                counter++;
            }
        }
        System.out.print(counter);
    }
}