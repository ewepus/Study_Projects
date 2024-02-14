import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()), m = Integer.parseInt(sc.nextLine());
        String[] array = sc.nextLine().split(" ");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(array[i * m + j]);
            }
        }
        sc.close();
        int[] vector = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result += matrix[i][j];
            }
            vector[i] = result;
            result = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) System.out.println(vector[i]);
    }
}
