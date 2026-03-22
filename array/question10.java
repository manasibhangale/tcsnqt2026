/*printing the subarrays
HINT:pehla ek number uthana hai , dusra ek number uthana hai aur fir dono number ke bichme jitne bhi numbers hai print krne hai */
public class question10 {
    public static void printsubarray(int arr[]){
        int totalsubarray=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                 totalsubarray++;
            }
            System.out.println();
        }
       System.out.println("the total subarrays are:"+totalsubarray);
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        printsubarray(arr);

    }
}
