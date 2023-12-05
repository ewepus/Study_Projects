package Lab_work_4;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = Integer.parseInt(sc.nextLine()), factorialResult = 1;
        long bigNumber = Long.MAX_VALUE;

        for (int i = factorial; i > 0; i--) {
            factorialResult *= i;
        }

        System.out.println(factorialResult);
    }
}
//var_7