class question11{
    public static void maxsubarraysum1(int arr[]){
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        maxsubarraysum1(arr);
    }
}