package geeksforgeeks;

public class secondlargest8 {
    public static int secondlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        if(arr==null || arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }if(secondlargest==Integer.MIN_VALUE){//all elements are same
            return -1;
        }
        return secondlargest;
    }

    public static void main(String args[]){
        int arr[]={1,2,4,7,3,6};
        System.out.println(secondlargest(arr));
    }
}
