package bitmanipulation;

public class add1toaninteger {
    public static void main(String args[]){
        int x=6;
        System.out.println(x+"+"+1+"is"+-~x);
        x=5;
        System.out.println(x+"+"+1+"is"+-~x);
        x=-4;
        System.out.println(x+"+"+1+"is"+-~x);
    }
}
/*
| Step | Operation | Binary Result | Decimal Result | Explanation                    |
| ---- | --------- | ------------- | -------------- | ------------------------------ |
| 1    | x = 6     | 00000110      | 6              | Initial value                  |
| 2    | ~x        | 11111001      | -7             | Flip all bits (1’s complement) |
| 3    | -~x       | 00000111      | 7              | Negation → gives x + 1         |
 */