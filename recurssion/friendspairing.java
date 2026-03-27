package recurssion;

public class friendspairing {
    public static int totalpair(int n){
        if (n==0||n==1) {
            return n;            
        }
        return totalpair(n-1)+((n-1)*totalpair(n-2));
    }
    public static void main(String args[]){
        System.out.println(totalpair(4));
    }
}
