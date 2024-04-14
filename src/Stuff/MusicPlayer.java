package Stuff;

import java.util.Scanner;
import java.util.Stack;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Stack<String> songs = new Stack<String>();

        while (!"stop".equalsIgnoreCase(input = scanner.nextLine())) {
            if ("back".equalsIgnoreCase(input)) {
                if (!songs.empty()) {
                    songs.pop();
                }
                if (!songs.empty()) {
                    System.out.println(songs.peek());
                    continue;
                }
                System.out.println("no previous songs");
            } else {
                songs.push(input);
                System.out.println(songs.peek());
            }
        }
    }
}
