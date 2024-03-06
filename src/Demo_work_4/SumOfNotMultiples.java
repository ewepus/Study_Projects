package Demo_work_4;

import java.util.Scanner;

public class SumOfNotMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, N = 23,  start = sc.nextInt(), finish = sc.nextInt();

        for (int i = start; i <= finish; i++) {
            if ((i % 3 == 0) || (i == N)) continue;
            sum += i;
        }

        System.out.println(sum);
    }
}
