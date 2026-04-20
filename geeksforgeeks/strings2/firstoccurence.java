package geeksforgeeks.strings2;

public class firstoccurence {
    public static int firstocc(String s,String subs){
        return s.indexOf(subs);
    }
    public static void main(String args[]){
        String s="mnasiamnamnn";
        String subs="an";
        System.out.println(firstocc(s,subs));
    }
}
