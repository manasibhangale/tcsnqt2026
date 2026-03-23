package sorting;

public class countingsort {
    public static void countsort(int arr[]){
        //finding the largest value from the array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //updating frequency
        int count[]=new int [largest+1];//largest+1 because we start from 0 index thats why
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++; //arr[0]=7 so in count at index7 update the count or frequency to be 1 then again arr[1]==7 so update the count arr at index 7 to +1 i.e. 2
        }
        //sorting
        int j=0;//the output array that will be displayed  
        for(int i=0;i<count.length;i++){//we are using the count array that we created
            while(count[i]>0){ //we only want the numbers whose count are more than 0 because practically those are the only numbers which are present in the original array
                arr[j]=i;
                j++;//pointer goes to next index to store new number
                count[i]--;//frequency reduces
            }
        }
    }
    //print array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={7,7,5,4,3,2,1,4,1};
        countsort(arr);
        printArr(arr);
    }
}
