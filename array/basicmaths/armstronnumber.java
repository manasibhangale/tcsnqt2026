package basicmaths;

import java.util.Scanner;

public class armstronnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number:");
        
        int n = sc.nextInt();
        int originalnum = n;
        int sum = 0;
        int countdigit = 0;

        int temp = n; // 🔥 use temp variable

        // count digits
        while (temp != 0) {
            int lastnum = temp % 10;
            countdigit++;
            temp = temp / 10;
        }

        temp = n; // 🔥 reset temp

        // calculate sum
        while (temp != 0) {
            int lastnum = temp % 10;
            sum += Math.pow(lastnum, countdigit);
            temp = temp / 10;
        }

        // check
        if (originalnum == sum) {
            System.out.print("It is an armstrong number");
        } else {
            System.out.print("It is not an armstrong number");
        }
    }
}