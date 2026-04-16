package geeksforgeeks.array2;

public class buyandsellstocks {
    public static int maxprofit(int arr[]){
        int buyingprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(buyingprice<arr[i]){
                int profit=arr[i]-buyingprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyingprice=arr[i];//if buying price is more than the current price then update the buying price to current price because you should buy at lowest price
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int arr[]={11,2,3,4,1,22,42};
        System.out.println(maxprofit(arr));
    }
}
