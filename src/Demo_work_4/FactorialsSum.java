package Demo_work_4;

import java.util.Scanner;

public class FactorialsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.next());
        int finish = Integer.parseInt(sc.next());
        long n = 23;
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i == n) continue;
            int factorial = i;
            for (int j = factorial - 1; j > 0; --j) {
                factorial *= j;
            }
            sum += factorial;
        }
        long factorial_n = 1;
        for (long j = n - 1; j > 0; --j) {
            factorial_n *= j;
        }
        System.out.println(sum);
        System.out.println(factorial_n);
    }
}