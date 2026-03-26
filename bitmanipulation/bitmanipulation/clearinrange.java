package bitmanipulation;
class clearinrange{
    public static int clearibits(int num,int i ,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask= a|b;
        return num & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearibits(4,2,3));
    }
}
/*
```java
// 📝 Dry Run (Notes)

// Input:
num = 4;   // 00000100
i = 2;
j = 3;

// Step 1: Left part
int a = (~0) << (j + 1);
// (~0) << 4
// 11111111 11111111 11111111 11110000

// Step 2: Right part
int b = (1 << i) - 1;
// (1 << 2) - 1
// 00000100 - 1 = 00000011

// Step 3: Mask
int mask = a | b;
// 11111111 11111111 11111111 11110000
// 00000000 00000000 00000000 00000011
// -----------------------------------
// 11111111 11111111 11111111 11110011

// Step 4: Final AND
int result = num & mask;
// 00000100
// 11110011
// --------
// 00000000

// Output:
System.out.println(result);  // 0
```
 */