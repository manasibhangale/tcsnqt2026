package recurssion;

public class firstoccurence {
    public static int firstocc(int arr[],int i,int key){
        if(i==arr.length-1){//if the whole array is traversed and key is not found then the key doesnt exist so return -1.
            return -1;
        }
        if(arr[i]==key){//if the current index is equal to the key then return the current index
            return i;
        }
        return firstocc(arr,i+1,key);//if the current index above is not the key then we check for the next index by i+1 recursively
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,7,5,7,6,7,8,9,1};
        System.out.println(firstocc(arr,0,6));
    }
}
