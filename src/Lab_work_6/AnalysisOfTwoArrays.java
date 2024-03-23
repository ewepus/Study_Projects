package Lab_work_6;

import java.util.*;

public class AnalysisOfTwoArrays {
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static String addToString(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (!text.contains(array[i])) {
                text += array[i] + " ";
            }
        }
        return text;
    }
    public static String sortArray (String[] array) {
        String text = "";
        int maxLength = Integer.MIN_VALUE, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength) maxLength = array[i].length();
            if (array[i].length() < minLength) minLength = array[i].length();
        }
        for (int i = maxLength; i >= minLength ; i--) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].length() == i) {
                    text += array[j] + " ";
                }
            }
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayFirst = sc.nextLine().split(" ");
        String[] arraySecond = sc.nextLine().split(" ");
        String text = "";

        text = addToString(arrayFirst, text);
        text = addToString(arraySecond, text);

        String[] combinedArray = text.split(" ");
        String[] combinedArraySorted = sortArray(combinedArray).split(" ");

        printArray(combinedArraySorted);
    }
}
//var_9
/*
write once run anywhere
run anywhere and everywhere
*/