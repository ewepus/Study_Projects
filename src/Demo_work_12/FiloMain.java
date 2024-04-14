package Demo_work_12;

import java.util.Scanner;

public class FiloMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        FILO<String> players = new FiloQueue<String>();
        for (String name : names) {
            players.offer(name);
        }

        int round = 1;
        while (round++ < count) {
            String currentPlayer = players.poll();
            System.out.println(currentPlayer + " took a ball");

            players.offer(currentPlayer);
        }
        System.out.println(players.poll() + " took the last ball");
    }
}
