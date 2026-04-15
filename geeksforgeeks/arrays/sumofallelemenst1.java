package geeksforgeeks.arrays;
class sumofallelemenst1{
    public static int sumofallelements(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr []={1,2,3,4};
        System.out.println(sumofallelements(arr));
    }
}