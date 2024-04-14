package Lab_work_12;

import java.util.Scanner;

public class IntegerStackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число и систему счисления, в которую надо перевести данное число");
        int number = scanner.nextInt();
        int numberSystem = scanner.nextInt();
        int newNumberLength = 1;
        String newNumber = "";

        while (number > Math.pow(numberSystem, newNumberLength)) {
            newNumberLength++;
        }
        IntegerStack stack = new IntegerStack(newNumberLength);

        for (int i = 0; i < newNumberLength; i++) {
            stack.push(number - number / numberSystem * numberSystem);
            number /= numberSystem;
        }
        while (!stack.isEmpty()) {
            newNumber += String.valueOf(stack.pop());
        }
        System.out.println(newNumber);
    }
}