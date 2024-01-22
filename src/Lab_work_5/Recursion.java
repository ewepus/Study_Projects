package Lab_work_5;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int max = maximum(text, Integer.MIN_VALUE, Integer.MIN_VALUE);
        int count = maximum(text, max, 0);
        System.out.println(count);
    }

    public static int maximum(String text, int value, int count) {
        if (value == Integer.MIN_VALUE) {
            if (!text.isEmpty()) {
                String currentNumber = "";
                if (!text.contains(" ")) {
                    currentNumber = text;
                    try {
                        if (!text.contains(" ")) {
                            int intCurrentNumber = Integer.parseInt(currentNumber);
                            return Math.max(intCurrentNumber, count);
                        } else {
                            int intCurrentNumber = Integer.parseInt(currentNumber);
                            return maximum(text.substring(text.indexOf(" ") + 1), value, Math.max(intCurrentNumber, count));
                        }

                    } catch (NumberFormatException e) {
                        return count;
                    }
                } else {
                    currentNumber = text.substring(0, text.indexOf(" "));
                    try {
                        if (!text.contains(" ")) {
                            int intCurrentNumber = Integer.parseInt(currentNumber);
                            return Math.max(intCurrentNumber, count);
                        } else {
                            int intCurrentNumber = Integer.parseInt(currentNumber);
                            return maximum(text.substring(text.indexOf(" ") + 1), value, Math.max(intCurrentNumber, count));
                        }

                    } catch (NumberFormatException e) {
                        return maximum(text.substring(text.indexOf(" ") + 1), value, count);
                    }
                }
            } else {
                return count;
            }
        } else {
            if (!text.isEmpty()) {
                String currentNumber = "";
                if (!text.contains(" ")) {
                    currentNumber = text;
                    try {
                        int intCurrentNumber = Integer.parseInt(currentNumber);
                        if (!text.contains(" ")) {
                            return intCurrentNumber == value ? ++count : count;
                        }
                        else {
                            if (intCurrentNumber == value) {
                                return maximum(text.substring(text.indexOf(" ") + 1), value, ++count);
                            } else {
                                return maximum(text.substring(text.indexOf(" ") + 1), value, count);
                            }
                        }
                    } catch (Exception e) {
                        return count;
                    }
                } else {
                    currentNumber = text.substring(0, text.indexOf(" "));
                    try {
                        int intCurrentNumber = Integer.parseInt(currentNumber);
                        if (!text.contains(" ")) {
                            return intCurrentNumber == value ? ++count : count;
                        }
                        else {
                            if (intCurrentNumber == value) {
                                return maximum(text.substring(text.indexOf(" ") + 1), value, ++count);
                            } else {
                                return maximum(text.substring(text.indexOf(" ") + 1), value, count);
                            }
                        }
                    } catch (Exception e) {
                        return maximum(text.substring(text.indexOf(" ") + 1), value, count);
                    }
                }
            } else {
                return count;
            }
        }
    }
}
//var_9