/*print all pairs
question :arr[]={1,2,3,4,5,6}
output:
(1,2)(1,3)(1,4)(1,5)(1,6)
(2,3)(2,4)(2,5)(2,6)
(3,4)(3,5)(3,6)
(4,5)(4,6)
(5,6)
 */
public class question9 {
    public static void printpairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        int arr[]={1,2,3,4,5,6};
        printpairs(arr);
    }
}
