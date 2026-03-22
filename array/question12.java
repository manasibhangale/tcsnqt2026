public class question12 {
    public static void maxsubarraysum2(int arr[]){
        int maxSum=Integer.MIN_VALUE;;
        int currSum=0;
        int prefix_array[]= new int[arr.length];
        prefix_array[0]=arr[0];//❤️
        for(int i=1;i<arr.length;i++){//❤️
            prefix_array[i]=prefix_array[i-1]+arr[i];//❤️
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=i==0?prefix_array[j]:prefix_array[j]-prefix_array[i-1];//currsum= prefix[end]-prefix[start-1]
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        maxsubarraysum2(arr);
    }
}
