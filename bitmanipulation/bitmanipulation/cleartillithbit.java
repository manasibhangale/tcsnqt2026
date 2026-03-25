package bitmanipulation;

public class cleartillithbit {
    public static int cleartillibit(int n,int i){
        int bitmask=(~0)<<i;
        return (n&bitmask);
    }
    public static void main(String args[]){
        System.out.println(cleartillibit(15,2));
    }
}
