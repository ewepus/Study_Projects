package Lab_work_2;

import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitName = scanner.nextLine().toLowerCase();
        String dayName = scanner.nextLine().toLowerCase();
        double fruitWeight = Double.parseDouble(scanner.nextLine());

        double fruitPrice = 0.0;
        double discountedPrice = 0.0;

        switch (fruitName) {
            case "apple" -> fruitPrice += 9.99 * 23 * fruitWeight;
            case "plum" -> fruitPrice += 10.98 * 23 * fruitWeight;
            case "banana" -> fruitPrice += 11.49 * 23 * fruitWeight;
            case "grapes" -> fruitPrice += 15.99 * 23 * fruitWeight;
            case "orange" -> fruitPrice += 17.99 * 23 * fruitWeight;
            case "kiwi" -> fruitPrice += 37.99 * 23 * fruitWeight;
            case "mango" -> fruitPrice += 39.99 * 23 * fruitWeight;
            default -> {
                System.out.print("INVALID");
                return;
            }
        }
        switch (dayName) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> discountedPrice += fruitPrice * 0.95;
            case "saturday", "sunday" -> discountedPrice += fruitPrice;
            default -> {
                System.out.print("INVALID");
                return;
            }
        }
        System.out.printf("%.2f", discountedPrice);
    }
}
//var_5
