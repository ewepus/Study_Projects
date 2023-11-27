package Demo_work_4;

import java.util.Scanner;

public class SumOfNotMultiples {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.next());
        int finish = Integer.parseInt(sc.next());
        for (int i = start; i <= finish; i++) {
            if ((i % 3 == 0) || (i == 23)) continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
