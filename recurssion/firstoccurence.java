package recurssion;

public class firstoccurence {
    public static int firstocc(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,7,5,7,6,7,8,9,1};
        System.out.println(firstocc(arr,0,6));
    }
}
