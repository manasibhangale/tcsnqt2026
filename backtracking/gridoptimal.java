/*
Ways = (n + m - 2)! / ((n - 1)! * (m - 1)!)
 */
public class gridoptimal {

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int totalWays(int n, int m) {

        int total = n + m - 2;

        return factorial(total) / 
              (factorial(n - 1) * factorial(m - 1));
    }

    public static void main(String[] args) {

        int n = 3, m = 3;
        System.out.println(totalWays(n, m));
    }
}