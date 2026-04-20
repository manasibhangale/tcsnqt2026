package geeksforgeeks.array2;

public class factorsofanumber {
    public static void factors(int n){
        int count=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i+"");
                count++;
            }
            if(i!=n/i){
                System.out.println(n/i+" ");
                count++;
            }
        }
        if(count<=2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
        System.out.println("count is: "+count);
    }
    public static void main(String args[]){
        int n = 6;
        factors(n);
    }
}
