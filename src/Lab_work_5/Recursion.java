package Lab_work_5;

import java.util.Scanner;

public class Recursion {
    static boolean checkIntNumber(String stringNumber) {
        try {
            Integer.parseInt(stringNumber);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    static int maximum(String text, int value, int count) {
        int posOfSpace = text.indexOf(' ');
        if (posOfSpace == -1) {
            posOfSpace = text.length();
        }
        String stringNumber = text.substring(0, posOfSpace);
        if (checkIntNumber(stringNumber)) {
            int number = Integer.parseInt(stringNumber);
            if (number > value) {
                value = number;
                count = 1;
            } else if (number == value) {
                count++;
            }
        }
        if (posOfSpace == text.length()) {
            return count;
        }
        return maximum(text.substring(posOfSpace + 1), value, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();

        System.out.println(maximum(userInput, 0, 0));
    }
}
//var_9