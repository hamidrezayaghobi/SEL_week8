import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter: n");
        int n = scanner.nextInt();
        long result = 0;
        result = okFibonacci(n);
        System.out.println(result);
    }

    public static long recursiveFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static long okFibonacci(int n) {
        long result;
        int f[] = new int[n + 2];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
