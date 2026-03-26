package bitmanipulation;

public class cleartillithbit {
    public static int cleartillibit(int n,int i){
        //~0 → all bits = 1
        //<< i → shift left by i → last i bits become 0
        //i = 2 → bitmask = 11111100
        int bitmask=(~0)<<i;
        return (n&bitmask);
    }
    public static void main(String args[]){
        System.out.println(cleartillibit(15,2));
    }
}
