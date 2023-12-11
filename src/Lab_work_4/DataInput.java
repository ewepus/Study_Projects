package Lab_work_4;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String mortgagePercentString = sc.nextLine().toLowerCase();
            if (mortgagePercentString.equals("stop")) {
                break;
            }
            while (!mortgagePercentString.contains("%")) {
                mortgagePercentString = sc.nextLine().toLowerCase();
            }

            String housingCostString = sc.nextLine().toLowerCase();
            if (housingCostString.equals("stop")) {
                break;
            }

            float mortgagePercent = Float.parseFloat(mortgagePercentString.replaceAll("[^0-9.]", "")) / 100 + 1;
            float housingCost = Float.parseFloat(housingCostString);

            while (true) {
                String monthlyPaymentString = sc.nextLine().toLowerCase();

                if (monthlyPaymentString.equals("stop")) {
                    System.out.println("Debt amount " + housingCost);
                    break;
                }

                if (monthlyPaymentString.contains("%")) {
                    continue;
                }

                float monthlyPayment = Float.parseFloat(monthlyPaymentString);
                if (housingCost - monthlyPayment < 0) {
                    System.out.println("Money left for repairs: " + Math.abs(housingCost - monthlyPayment));
                    break;
                }

                housingCost = (float) Math.ceil((housingCost - monthlyPayment) * mortgagePercent);

                if (housingCost == 0) {
                    System.out.println("Home! Sweet Home");
                    break;
                }
            }
        }
    }
}
//var_7 (1-A; 2-A; 3-A; 4-B)