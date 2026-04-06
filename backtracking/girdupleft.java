public class girdupleft {
    public static int totalways(int n,int m,int i,int j){
        // ✅ Base Case 1: Reached starting cell (0,0)
        // Only one way exists (we are already at the destination)
        if(i==0 && j==0){
            return 1;
        }else if(i<0 || j<0){
        // ❌ Base Case 2: Out of bounds
        // If indices go negative, it's an invalid path
            return 0;
        }
        int w1=totalways(n,m,i-1,j);
        int w2=totalways(n,m,i,j-1);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.println(totalways(n, m, n-1, m-1));

    }
}
