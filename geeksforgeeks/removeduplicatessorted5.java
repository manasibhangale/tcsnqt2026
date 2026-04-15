/*Given a sorted array arr[] of size N, remove the duplicate elements in-place such that each element appears only once and return the new length of the array containing unique elements.

The relative order of elements should be maintained.
Do not use extra space. */
package geeksforgeeks;

public class removeduplicatessorted5 {
    public static int removeduplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,5,5,5,6,6};
        int newlength=removeduplicate(arr);
        for(int i=0;i<newlength;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
