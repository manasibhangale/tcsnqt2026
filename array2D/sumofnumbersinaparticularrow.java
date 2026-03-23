package array2D;
public class sumofnumbersinaparticularrow {
    public static int sum(int nums[][]){
        int sum=0;
        for(int i=1;i<=1;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[]){
         int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };
         System.out.println(sum(nums));
    }
}
