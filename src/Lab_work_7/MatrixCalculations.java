package Lab_work_7;

import java.util.Scanner;

public class MatrixCalculations {
    static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void diagonalSum(int[][] array) {
        for (int k = array.length - 1; k >= 0; k--) {
            int sum = array[0][k];
            boolean check = false;
            if (k + 1 == array.length) {
                System.out.println(sum);
                continue;
            }
            for (int i = 1; i < array.length; i++) {
                for (int j = k + 1; j < array.length; j++) {
                    sum += array[i][j];
                    i++;
                    if (j + 1 == array.length) {
                        check = true;
                        break;
                    }
                }
                if (check) break;
            }
            System.out.println(sum);
        }

        for (int l = 1; l < array.length; l++) {
            int sum = array[l][0];
            boolean check = false;
            if (l + 1 == array.length) {
                System.out.println(sum);
                continue;
            }
            for (int i = l + 1; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    sum += array[i][j];
                    if (i + 1 == array.length) {
                        check = true;
                        break;
                    }
                    i++;
                }
                if (check) break;
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        printMatrix(array);
        System.out.println();
        diagonalSum(array);
    }
}
/*
4
4 3 2 1 5 4 3 2 6 5 4 3 7 6 5 4
var_3 */
