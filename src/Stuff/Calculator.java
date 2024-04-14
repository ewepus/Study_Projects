package Stuff;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");
        Deque<String> stack = new ArrayDeque<>();
        for (int i = items.length - 1; i != -1 ; i--) {
            stack.push(items[i]);
        }

        while (stack.size() >= 3) {
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());
            System.out.println("LOG: " + first + operator + second);

            int result = switch (operator) {
                case "+" -> first + second;
                default -> first - second;
            };
            stack.push(String.valueOf(result));
        }
        System.out.println(stack.peek());
    }
}
