package Lab_work_4;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPrime = Integer.MIN_VALUE;
        int minNonPrime = Integer.MAX_VALUE;

        while (true) {
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("stop")) {
                if ((maxPrime == Integer.MIN_VALUE) && (minNonPrime == Integer.MAX_VALUE)) {
                    System.out.println("prime_undefined");
                    System.out.println("non_prime_undefined");
                } else if ((maxPrime != Integer.MIN_VALUE) && (minNonPrime == Integer.MAX_VALUE)) {
                    System.out.println("prime_" + maxPrime);
                    System.out.println("non_prime_undefined");
                } else if ((maxPrime == Integer.MIN_VALUE) && (minNonPrime != Integer.MAX_VALUE)) {
                    System.out.println("prime_undefined");
                    System.out.println("non_prime_" + minNonPrime);
                } else {
                    System.out.println("prime_" + maxPrime);
                    System.out.println("non_prime_" + minNonPrime);
                }
                break;
            }

            int numberInput = Integer.parseInt(userInput);
            int divisorCount = 0;

            if ((numberInput <= 0) || (numberInput == 1) || (numberInput == 23)) {
                System.out.println("invalid");
            } else {
                for (int i = 1; i <= numberInput + 1; i++) {
                    if (numberInput % i == 0) {
                        divisorCount += 1;
                    }
                }
                if (divisorCount == 2) {
                    maxPrime = Math.max(maxPrime, numberInput);
                } else if (divisorCount > 2) {
                    minNonPrime = Math.min(minNonPrime, numberInput);
                }
            }
        }
    }
}
//var_7