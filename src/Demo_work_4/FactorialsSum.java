package Demo_work_4;

import java.util.Scanner;

public class FactorialsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.next()), finish = Integer.parseInt(sc.next()), sequenceNumber = 23, sum = 0;

        if ((start < 0) || (finish < 0) || (start > finish)) {
            System.out.println("invalid");
        } else {
            for (int i = start; i <= finish; i++) {
                if (i == sequenceNumber) continue;
                if (i == 0) {
                    sum += 1;
                }
                int factorial = i;
                for (int j = factorial - 1; j > 0; --j) {
                    factorial *= j;
                }
                sum += factorial;
            }

            long factorial_n = 1;
            for (long j = sequenceNumber - 1; j > 0; --j) {
                factorial_n *= j;
            }

            System.out.println(sum);
            System.out.println(factorial_n);
        }
    }
}
//раздробить умножение чисел