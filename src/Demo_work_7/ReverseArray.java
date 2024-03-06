package Demo_work_7;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); //строки
        int m = Integer.parseInt(sc.nextLine()); //столбцы
        String[] array = sc.nextLine().split(" ");
        sc.close();

        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = array[i * m + j];
            }
        }
        String[][] reverseVertical = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverseVertical[n - i - 1][j] = matrix[i][j];
            }
        }
        String[][] reverseHorizontal = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverseHorizontal[i][m - j - 1] = matrix[i][j];
            }
        }

        printMatrix(matrix);
        printMatrix(reverseVertical);
        printMatrix(reverseHorizontal);
        sc.close();
    }

    static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
