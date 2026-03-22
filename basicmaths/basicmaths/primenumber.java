package basicmaths;
import java.util.*;
class primenumbber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int counter=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                counter++;
            }
            if(n/i!=i){
                counter++;
            }
        }
        if(counter==2){
            System.out.print("PRIME NUMBER");
        }else{
            System.out.print("NOT A PRIME NUMBER");
        }
    }
}
