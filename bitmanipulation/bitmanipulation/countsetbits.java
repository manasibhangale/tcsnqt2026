package bitmanipulation;
//set bits means bits that are 1
public class countsetbits {
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){//checks if the last bit is 0 or 1, if it is 1 it increments count , if it is 0 it falls out of the if statement
                count++;
            }
            n=n>>1;//once the last bit is checked we need to move on to the second last bit for that we should right shift the number by 1 to get the next last digit.
        }
        return count;
    }
    public static void main(String args[]){
        System.out.print(countsetbits(7));
    }
}
