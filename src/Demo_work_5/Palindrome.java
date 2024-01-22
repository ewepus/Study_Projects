package Demo_work_5;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = sc.nextLine();
        String formattedText = text.toLowerCase().replaceAll("[ !?,.−_]", "");
        System.out.printf(
                "'%s' %s palindrome",
                text,
                ((isPalindrome(formattedText)) ? "is a" : "is NOT a"));
    }

    static boolean isPalindrome(String msg) {
        if (msg.isEmpty() || msg.length() == 1) return true;
        else {
            if (msg.charAt(0) != msg.charAt(msg.length() - 1)) {
                return false;
            } else {
                return isPalindrome(msg.substring(1, msg.length() - 1));
            }
        }
    }
}
/* − А роза упала на лапу Азора
− Мат и тут и там!
− Лег на храм, и дивен и невидим Архангел.
*/