public class Summation {
    public static void main(String[] args) {
        sum(1.1, sum(10, 12));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
