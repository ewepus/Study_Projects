package Demo_work_12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TasksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Queue<String> tasks = new ArrayDeque<>();

        while (!"print".equalsIgnoreCase(input = scanner.nextLine())) {

            if ("done".equalsIgnoreCase(input)) {
                if (tasks.isEmpty()) System.out.println("NO tasks");
                else System.out.println("DONE: " + tasks.poll());
            } else {
                tasks.offer(input);
            }
        }
        for (String task : tasks) {
            System.out.println("DO IT: " + task);
        }
    }
}
