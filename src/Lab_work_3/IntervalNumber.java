package Lab_work_3;

import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 23;
        int input = Integer.parseInt(sc.nextLine());
        while (!((input > 4*n && input < 5*n) || (input > 14*n && input < 15*n))) {
            System.out.println("Not_yet");
            input = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Correct_number_" + input);
    }
}
//var_9
