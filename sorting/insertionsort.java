/*
==============================
INSERTION SORT – CORE FORMULAS
==============================

1. Initialization:
for(i = 1; i < n; i++)

2. Current Element:
curr = arr[i]

3. Previous Pointer:
prev = i - 1

4. Shift Condition:
while(prev >= 0 && arr[prev] > curr)

5. Shift Operation:
arr[prev + 1] = arr[prev]

6. Move Backward:
prev--

7. Insert Operation:
arr[prev + 1] = curr */
package sorting;

public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //if the prev becomes -1 then prev+1 makes it 0 and curr is stored at 0th position
            arr[prev+1]=curr;
        }
    }
        public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
    
    public static void main(String args[]){
        int arr[]={7,8,5,2,9,1};
        insertion(arr);
        printArr(arr);
    }
}
