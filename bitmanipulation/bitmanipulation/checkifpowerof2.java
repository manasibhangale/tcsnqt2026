package bitmanipulation;

public class checkifpowerof2 {
    public static void powerof2(int n){
        if((n&(n-1))==0){
            System.out.println("yes the number"+ n +"is of power 2.");
        }else{
            System.err.println("no the number"+n +"is not the power of 2.");
        }
    }
    public static void main(String args []){
        powerof2(4);
    }
}
/*
1] 4=100
3=011
4&3=0
2] 8=1000
7=0111
8&7=0
if an even number in binary and  that number -1 is operated with & then the result will be always 0 */
