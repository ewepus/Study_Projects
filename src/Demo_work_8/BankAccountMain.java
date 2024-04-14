package Demo_work_8;

import java.util.Scanner;

public class BankAccountMain {
    public static BankAccount[] accounts = new BankAccount[100];
    public static int id = 0;

    public static void create() {
        BankAccount account = new BankAccount();
        accounts[id] = account;
        id++;
        System.out.println("Account ID" + id + " created");
    }

    public static void setInterest(String input) {
        try {
            input = input.replace("set interest ", "");
            int interestRate = Integer.parseInt(input);
            if (interestRate > 0) {
                BankAccount.setInterestRate(interestRate);
                System.out.println("Interest rate changed to " + interestRate);
            } else System.out.println("INVALID VALUE");
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
    }

    public static void addDeposit(String input) {
        try {
            input = input.replace("add deposit ", "");
            int idFromInput = Integer.parseInt(input.substring(0, input.indexOf(" "))) - 1;
            if (idFromInput < 0 || idFromInput > 99 || accounts[idFromInput] == null) {
                System.out.println("Account ID" + (idFromInput + 1) + " does not exist");
            } else {
                int amount = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
                if (amount > 0) {
                    accounts[idFromInput].deposit(amount);
                    System.out.println("Deposited " + amount + " to ID" + (idFromInput + 1));
                } else System.out.println("INVALID VALUE");
            }
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
    }

    public static void getInterest(String input) {
        try {
            input = input.replace("get interest ", "");
            int idFromInput = Integer.parseInt(input.substring(0, input.indexOf(" "))) - 1;
            if (idFromInput < 0 || idFromInput > 99 || accounts[idFromInput] == null) {
                System.out.println("Account ID" + (idFromInput + 1) + " does not exist");
            } else {
                int years = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
                if (years > 0) {
                    System.out.println(accounts[idFromInput].getInterest(years));
                } else System.out.println("INVALID VALUE");
            }
        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine().toLowerCase();

            if (input.equals("end")) {
                break;
            }
            if (input.equals("create")) {
                create();
            } else if (input.contains("set interest")) {
                setInterest(input);
            } else if (input.contains("add deposit")) {
                addDeposit(input);
            } else if (input.contains("get interest")) {
                getInterest(input);
            }
        }
    }
}