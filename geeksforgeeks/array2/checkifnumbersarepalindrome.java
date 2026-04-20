package geeksforgeeks.array2;

public class checkifnumbersarepalindrome {
    public static boolean ispalindrome(int num){
        int original=num;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return original==rev;
    }
    public static void main(String args[]){
        int num=22;
        System.out.println(ispalindrome(num));
    }
}
