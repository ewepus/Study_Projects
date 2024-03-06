package Lab_work_7;

import java.util.Scanner;

public class FIllArray {
    static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void fillMatrix(int[][] array, int r, int c, int n) {
        array[r][c] = n;
        for (int i = r - 1; i >= 0; i--) {
            array[i][c] = array[i + 1][c] + 1;
        }
        for (int i = r; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                array[i][j] = array[i][j + 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] array = new int[r][c];
        r--;
        c--;
        int n = sc.nextInt();
        fillMatrix(array, r, c, n);
        printMatrix(array);
    }
}
//var_3