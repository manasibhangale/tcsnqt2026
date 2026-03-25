package bitmanipulation;

public class updateithbit {
    public static int clearbit(int n,int i){
        int bitmask=~(1<<i);
        return (n&bitmask);
    }
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return (n|bitmask);
    }
    public static int  updatebit(int n,int i,int newBit){
        if(newBit==0){
        return clearbit( n, i);
        }else{
        return setbit(n,i);
        }
    }
    public static void main(String args[]){
        System.out.println(updatebit(5,1,1));
    }
}
