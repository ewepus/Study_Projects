package Lab_work_1;

import java.util.Scanner;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = 23.0;
        double input_1 = Double.parseDouble(scanner.nextLine());
        double input_2 = Double.parseDouble(scanner.nextLine());
        double answer = (pow(input_1,2) + pow(input_2,3))/N + (log(N)/log(input_1) - log(input_2)/log(input_1));
        System.out.printf("%.2f",answer);
    }
}
//var_10