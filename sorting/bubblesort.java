package sorting;
class bubblesort{
    public static void bubblesortcode(int arr[]){
         int totalswap=0;
        for(int turns=0;turns<arr.length-1;turns++){ //👍
           int swap=0;
            for(int j=0;j<arr.length-1-turns;j++){//👍
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;//👍
                    totalswap++; //👍
                }
            }
            System.out.println("swaps per pass:"+swap);//👍
        }
        System.out.println("total number of swaps:"+totalswap);//👍
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[]){
        int arr[]={3,4,6,5,2,1,9,7};
        bubblesortcode(arr);
        printArr(arr);
    }
}