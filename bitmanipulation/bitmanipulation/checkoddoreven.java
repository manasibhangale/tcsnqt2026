
public class checkoddoreven {
    public static void evenodd(int n){
        if((n & 1) == 0){//&1 gives lsb the rightmost last bit 
            //if the lsb is 0 it is even if it is 1 thn it is odd
            System.out.println("it is even number");
        } else {
            System.out.println("it is odd number");
        }
    }

    public static void main(String args[]){
        evenodd(11);
    }
}