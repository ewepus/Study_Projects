import java.util.Scanner;

public class ThreeMatrix {

    // Константы для обозначения символов в массиве
    public static final char P = 'P'; // Точка, где находится пользователь
    public static final char L = 'L'; // Точка перехода на следующий этаж
    public static final char O = 'O'; // Точка, в которую можно сделать шаг
    public static final char F = 'F'; // Конечная точка движения
    public static final char B = 'B'; // Точка, представляющая препятствие
    // Трехмерный массив, представляющий здание
    public static char[][][] flat = {
            {
                    {P, O, O, O, O, O},
                    {O, O, O, O, O, O},
                    {O, O, O, O, O, O},
                    {O, O, O, O, O, O},
                    {O, B, L, B, O, O}
            },
            {
                    {L, O, O, B, O, O},
                    {O, O, O, O, O, O},
                    {O, O, B, O, O, O},
                    {B, O, O, O, O, O},
                    {O, O, O, O, O, O}
            },
            {
                    {O, O, O, O, O, O},
                    {O, O, O, B, O, O},
                    {O, O, O, O, O, O},
                    {O, O, O, O, B, O},
                    {O, B, O, F, O, O}
            },
    };
    public static final char W = 'w'; // Вперед
    public static final char S = 's'; // Назад
    public static final char A = 'a'; // Налево
    public static final char D = 'd'; // Направо

    // Константы для обозначения размеров массива
    public static final int FLOORS = flat.length; // Количество этажей
    public static final int ROWS = flat[0].length; // Количество строк на каждом этаже
    public static final int COLS = flat[0][0].length; // Количество столбцов на каждом этаже
    public static int floor = 0; // Текущий этаж
    public static int row = 0; // Текущая строка
    public static int col = 0; // Текущий столбец

    static boolean checkCommand(String line) {
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != W && c != A && c != S && c != D) {
                return false;
            }
        }
        return true;
    }

    static boolean runCommand(char c) {
        int newRow = row;
        int newCol = col;

        if (c == W) {
            newRow--;
        }
        else if (c == S) {
            newRow++;
        }
        else if (c == A) {
            newCol--;
        }
        else {
            newCol++;
        }

        if (newRow >= 0 && newRow < ROWS && newCol >= 0 && newCol < COLS) {
            if (flat[floor][newRow][newCol] == B) {
                return false;
            }
            flat[floor][row][col] = O;
            if (flat[floor][newRow][newCol] == L) {
                floor++;
            }
            row = newRow;
            col = newCol;
            flat[floor][row][col] = P;
            return true;
        }
        else {
            return false;
        }
    }

    static void printMatrix() {
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < ROWS; j++) {
                for (int k = 0; k < COLS; k++) {
                    System.out.print(flat[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //ИЩЕМ начальную позицию
        for(int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < ROWS; j++) {
                for (int k = 0; k < COLS; k++) {
                    if (flat[i][j][k] == P) {
                        floor = i;
                        row = j;
                        col = k;
                    }
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (flat[floor][row][col] != F) {
            String line = scanner.nextLine();
            line = line.replace(" ", "");
            if (checkCommand(line)) {
                for (int i = 0; i < line.length(); i++) {
                    if (runCommand(line.charAt(i))) {
                        printMatrix();
                    }
                    else {
                        System.out.println("Невозможно выполнить данную команду");
                    }
                }
            }
            else {
                System.out.println("Некорректная команда");
            }
        }
    }
}
