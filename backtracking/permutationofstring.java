

public class permutationofstring {
    public static void permutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            String newstr=s.substring(0,i)+s.substring(i+1);
            permutation(newstr,ans+currchar);
        }
    }
     public static void main(String args[]){
        String s="abc";
        permutation(s,"");
     }
}
