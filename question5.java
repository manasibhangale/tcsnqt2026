/* linear search */
class question5{
    public static int linearsearch(int arr[],int key ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,88,95,32,6,7};
        int key=32;
        int result=linearsearch(arr,key);
        System.out.println("the key is found at:"+result);
        if(result==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND");
        }

    }
}