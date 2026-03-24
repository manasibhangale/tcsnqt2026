package string;
class largeststringlexicographically{
    public static void largest(String arr[]){
        String largest=arr[0];//assume that the first element is the largest
        for(int i=0;i<arr.length;i++){//run the for loop from the starting element to the last element of the array
            if(largest.compareTo(arr[i])<0){//compare to function compare 2 strings letter by letter if it is = then both the strings are same if it is <0 then string2 is greater than string 1 if it is >0 then the string1 is greater than string 2
                largest=arr[i];//here comapreto is<0 that means string2 i.e arr[i] is graeter than string1 i.e. largest
            }
        }
        System.out.println(largest);//print largest
    }
    public static void main(String args[]){
        String arr[]={"apple","pineapple","mango","starfruit","watermelon" };
        largest(arr);
    }
}