package bitmanipulation;

public class checkifpowerof2 {
    public static void powerof2(int n){
        if((n&(n-1))==0){
            System.out.println("yes the number"+ n +"is of power 2.");
        }else{
            System.err.println("no the number"+ n +"is not the power of 2.");
        }
    }
    public static void main(String args []){
        powerof2(4);
    }
}
