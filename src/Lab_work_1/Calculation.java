package Lab_work_1;

import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputFirst = scanner.nextDouble();
        double inputSecond = scanner.nextDouble();
        int sequenceNum = 23;

        double result = (pow(inputFirst, 2) + pow(inputSecond, 3)) / sequenceNum + (log(sequenceNum) / log(inputFirst)
                - log(inputSecond) / log(inputFirst));
        System.out.printf("%.2f", result);
    }
}
//var_10