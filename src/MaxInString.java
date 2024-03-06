public class MaxInString {

    static boolean checkIntNumber(String t) {
        try {
            Integer.parseInt(t);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    static int maximum(String s, int value, int count) {
        int pos = s.indexOf(' ');
        if (pos == -1) {
            pos = s.length();
        }
        String t = s.substring(0, pos);
        if (checkIntNumber(t)) {
            int number = Integer.parseInt(t);
            if (number > value) {
                value = number;
                count = 1;
            }
            else if (number == value) {
                count++;
            }
        }
        if (pos == s.length()) {
            return value;
        }
        return maximum(s.substring(pos+1), value, count);
    }

    public static void main(String[] args) {
        String s = "5 11.1 5 23 8 23";

        int max = maximum(s, 0, 0);
        System.out.println(max);
    }
}
