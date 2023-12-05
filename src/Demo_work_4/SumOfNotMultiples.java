package Demo_work_4;

import java.util.Scanner;

public class SumOfNotMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, start = Integer.parseInt(sc.next()), finish = Integer.parseInt(sc.next());

        for (int i = start; i <= finish; i++) {
            if ((i % 3 == 0) || (i == 23)) continue;
            sum += i;
        }

        System.out.println(sum);
    }
}
