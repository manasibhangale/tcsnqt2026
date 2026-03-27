package recurssion;

public class binarystringproblem {
    public static void noadjacent1(int n, int lastbit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        noadjacent1(n-1, 0, str+"0");
        if(lastbit==0){
            noadjacent1(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        noadjacent1(3, 0, "");
    }
}
