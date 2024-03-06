package Demo_work_7;

import java.util.Arrays;

public class CubicArray {
    public static void main(String[] args) {
        int n = 2, m = 3, k = 4;
        int[][][] trio = new int[n][m][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    trio[i][j][l] = (i + 1) * (j + 1) * (l + 1);
                    //trio[i][j][l] = i + j + l;
                }
            }
        }
        System.out.println(Arrays.deepToString(trio[0]).replace("],", "],\n").replace("[[",
                "[[[").replace("]]", "]]]").replace(" [", " [[")
                .replace("],", "]],"));
        System.out.println();
        System.out.println(Arrays.deepToString(trio[1]).replace("],", "],\n").replace("[[",
                        "[[[").replace("]]", "]]]").replace(" [", " [[")
                .replace("],", "]],"));
    }
}
