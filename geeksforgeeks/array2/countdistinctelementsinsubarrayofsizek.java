package geeksforgeeks.array2;
import java.util.HashMap;
import java.util.Map;

public class countdistinctelementsinsubarrayofsizek {
    public static void countDistinct(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(i,0)+1);
        }
        System.out.print(map.size()+" ");// prints first distinct number in window 1
        //remove previous element (move window forward)
        for(int i=k;i<arr.length;i++){
            int prev=arr[i-k];//1st element from the leftmost part in the previous subarray
            if(map.get(prev)==1){//if the frequency of that prev is 1 remove it completely or else reduce 1
                map.remove(prev);
            }else{
                map.put(prev,map.get(prev)-1);
            }
            int curr = arr[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            // Print distinct count
            System.out.print(map.size() + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 2, 3};
        int k = 4;
        countDistinct(arr, k);
    }
}