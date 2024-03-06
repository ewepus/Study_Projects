package Lab_work_2;

import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitName = scanner.nextLine().toLowerCase();
        String dayName = scanner.nextLine().toLowerCase();
        double fruitWeight = Double.parseDouble(scanner.nextLine());

        if (fruitWeight <= 0) {
            System.out.println("INVALID");
        } else {
            int sequenceNum = 23;
            double fruitPrice = 0.0;
            double finalPrice = 0.0;

            switch (fruitName) {
                case "apple" -> fruitPrice += 9.99 * sequenceNum * fruitWeight;
                case "plum" -> fruitPrice += 10.98 * sequenceNum * fruitWeight;
                case "banana" -> fruitPrice += 11.49 * sequenceNum * fruitWeight;
                case "grapes" -> fruitPrice += 15.99 * sequenceNum * fruitWeight;
                case "orange" -> fruitPrice += 17.99 * sequenceNum * fruitWeight;
                case "kiwi" -> fruitPrice += 37.99 * sequenceNum * fruitWeight;
                case "mango" -> fruitPrice += 39.99 * sequenceNum * fruitWeight;
                default -> {
                    System.out.print("INVALID");
                    return;
                }
            }

            switch (dayName) {
                case "monday", "tuesday", "wednesday", "thursday", "friday" -> finalPrice += fruitPrice * 0.95;
                case "saturday", "sunday" -> finalPrice += fruitPrice;
                default -> {
                    System.out.print("INVALID");
                    return;
                }
            }
            System.out.printf("%.2f", finalPrice);
        }
    }
}
//var_5
