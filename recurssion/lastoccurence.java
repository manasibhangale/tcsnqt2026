package recurssion;

public class lastoccurence {
    public static int lastocc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastocc(arr,i+1,key);
        if(isfound ==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,4,5,7,6,9,8,6,9};
        System.out.println(lastocc(arr,0,6));
    }
}
