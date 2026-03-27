package recurssion;
public class print1ton {
    public static void print1ton(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print1ton(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        print1ton(5);
    }
}
