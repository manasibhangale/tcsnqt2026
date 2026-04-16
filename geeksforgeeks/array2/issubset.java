//check if all elements of arr2 is present in arr1
package geeksforgeeks.array2;

public class issubset {
    public static boolean is_subset(int arr1[],int arr2[]){
        if (arr2.length>arr1.length){
            return false;
        }
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]==arr2[j]){
                i++;
                j++;
            }else{
                return false;
            }
        }
        return j==arr2.length;

    }
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={3,4,7,5};
        System.out.println(is_subset(arr1, arr2));
    }
}
