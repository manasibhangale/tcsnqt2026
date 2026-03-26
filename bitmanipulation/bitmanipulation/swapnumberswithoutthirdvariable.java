package bitmanipulation;

public class swapnumberswithoutthirdvariable {
    public static void swap(int num1,int num2){
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("the swapped value of num1 is:"+num1);
        System.out.println("the swapped value of num2 is:"+num2);
    }
    public static void main(String args[]){
        swap(3,4);
    }
}
/*
initial values:
| Variable | Decimal | Binary |
| -------- | ------- | ------ |
| x        | 3       | 011    |
| y        | 4       | 100    |
dry run:
| Step | Operation | x (Binary) | y (Binary) | Explanation     |
| ---- | --------- | ---------- | ---------- | --------------- |
| 1    | x = x ^ y | 111        | 100        | 011 ^ 100 = 111 |
| 2    | y = x ^ y | 111        | 011        | 111 ^ 100 = 011 |
| 3    | x = x ^ y | 100        | 011        | 111 ^ 011 = 100 |
 */
