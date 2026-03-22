public class question13 {
    public static void maxsubarraysum3(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        maxsubarraysum3(arr);
    }
}
