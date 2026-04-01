package backtracking;

public class stringsubset {
    public static void findsubset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes
        findsubset(str,i+1,ans+str.charAt(i));
        //no
        findsubset(str,i+1,ans);
    }
    public static void main(String args[]){
        String str="abc";
        findsubset(str, 0, " ");
    }
}
