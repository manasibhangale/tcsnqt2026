package divideandconquer;
class mergesort{
    public static void merge_sort(int arr[],int si,int ei){
       if(si>=ei){ //base condition
        return;
       } 
       int mid=si+(ei-si)/2;//mid formula
       merge_sort(arr,si,mid);//left
       merge_sort(arr,mid+1,ei);//right
       merge(arr,si,mid,ei);//merge
    }
    public static void merge(int arr[],int si,int mid,int ei){
        
        int i=si;//left
        int j=mid+1;//right
        int k=0;//temp iterator
        int temp[]=new int[ei-si+1];//new temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){ 
                temp[k]=arr[i];
                k++;i++;
            }else{
                temp[k]=arr[j];
                k++;j++;
            }
        }
        while(i<=mid){//remaining elements of left part
            temp[k++]=arr[i++];
        }
        while(j<=ei){//remaining elements  if right part
            temp[k++]=arr[j++];
        }
        for(k=0;k<temp.length;k++){//copy elements from temp to original array
            arr[k]=temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,5,4,3,6,7,2,8};
        merge_sort(arr,0,arr.length-1);
        printArr(arr);
    }
}