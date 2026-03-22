/*printing the subarrays
HINT:pehla ek number uthana hai , dusra ek number uthana hai aur fir dono number ke bichme jitne bhi numbers hai print krne hai 
question:arr[]={10,20,30,40,50}
total subarrays will always be n(n+1)/2
here n=5
5(5+1)/2 ==> 15 total subarrays
output:
10 
10 20
10 20 30
10 20 30 40
10 20 30 40 50

20
20 30
20 30 40
20 30 40 50

30
30 40
30 40 50

40
40 50

50

the total subarrays are:15
PS D:\tcsnqt> */
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
