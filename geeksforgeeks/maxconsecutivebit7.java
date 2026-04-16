package geeksforgeeks;
public class maxconsecutivebit7 {
    public static int count(int arr[]){
        int maxcount=1;
        int currcount=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                currcount++;
                maxcount=Math.max(maxcount,currcount);
            }else{
                currcount=1;
            }
        }
        return maxcount;
    }
    public static void main(String args[]){
        int arr[]={1,0,1,0,0,0,0,0,1,1,1,1};
        System.out.println(count(arr));
    }
}
