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
        return clearbit( n, i);//if the bit to update is 0 then just clear the bit at ith position
        }else{
        return setbit(n,i);//if the bit to update is 1 then set the ith pposition as 1
        }
    }
    public static void main(String args[]){
        System.out.println(updatebit(5,1,1));
    }
}
