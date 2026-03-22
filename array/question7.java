public class question7 {
    public static int binarysearch(int arr[],int key){
        int start=arr[0];
        int end=arr[arr.length-1];
        int mid=(start+end)/2;
        
        if(arr[mid]==key){
            return mid;
        }else if(mid>key){
            for(int i=0;i<=arr[mid-1];i++){
                if(arr[i]==key){
                    return i;
                }
            }
        }else if(mid<key){
            for(int i=arr[mid+1];i<=arr.length;i++){
                if(arr[i]==key){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8};
        int key=7;
        System.out.println("key is found at index:"+binarysearch(arr,key));
    }
}
