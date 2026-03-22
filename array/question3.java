/*
Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

Example 2:

input : 10  -> Value of N 

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity. */
import java.util.*;
public class question3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of passengers:");
        int numberOfPassengers= sc.nextInt();
        int risk[]=new int[numberOfPassengers];
        for(int i=0;i<risk.length;i++){
            risk[i]=sc.nextInt();
        }
        int countOfZero=0,countOfOne=0,countOfTwo=0;
        for(int i=0;i<risk.length;i++){
            if(risk[i]==0){
                countOfZero++;
            }else if(risk[i]==1){
                countOfOne++;
            }else if(risk[i]==2){
                countOfTwo++;
            }
        }
        int j=0;
        while(countOfZero>0){
            risk[j++]=0;
            countOfZero--;
        }
        while(countOfOne>0){
            risk[j++]=1;
            countOfOne--;
        }
        while(countOfTwo>0){
            risk[j++]=2;
            countOfTwo--;
        }
        for(int i=0;i<risk.length;i++){
            System.out.print(risk[i]+" ");
        }
    }
}
/*
Logic (Counting Method)

Initialize three counters:

count0 = 0

count1 = 0

count2 = 0

Traverse the array:

If element is 0 → increment count0

If element is 1 → increment count1

If element is 2 → increment count2

Refill the array from start:

First place all 0s (count0 times)

Then place all 1s (count1 times)

Then place all 2s (count2 times) */