import java.util.Scanner;

public class JavaDif {
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
    public static final char A = 'a'; // Налево
    public static final char S = 's'; // Назад
    public static final char D = 'd'; // Направо

    // Константы для обозначения размеров массива
    public static final int FLOORS = flat.length; // Количество этажей
    public static final int ROWS = flat[0].length; // Количество строк на каждом этаже
    public static final int COLS = flat[0][0].length; // Количество столбцов на каждом этаже
    public static int floor = 0; // Текущий этаж
    public static int row = 0; // Текущая строка
    public static int col = 0; // Текущий столбец

    static void printFloor() {
        System.out.println("Вы находитесь на " + (floor + 1) + " этаже");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (j == COLS - 1) System.out.print(flat[floor][i][j]);
                else System.out.print(flat[floor][i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkCommand(String input) {
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter != W && letter != A && letter != S && letter != D) {
                return false;
            }
        }
        return true;
    }

    static boolean executeCommand(char letter) {
        int nextRow = row, nextCol = col;
        if (letter == W) {
            nextRow--;
        } else if (letter == A) {
            nextCol--;
        } else if (letter == S) {
            nextRow++;
        } else {
            nextCol++;
        }

        if (nextRow >= 0 && nextRow < ROWS && nextCol >= 0 && nextCol < COLS) {
            if (flat[floor][nextRow][nextCol] == F) {
                flat[floor][row][col] = O;
                row = nextRow;
                col = nextCol;
                return true;
            }
            if (flat[floor][nextRow][nextCol] == B) {
                return false;
            }
            flat[floor][row][col] = O;
            if (flat[floor][nextRow][nextCol] == L) {
                flat[floor][row][col] = L;
                floor++;
            }
            flat[floor][nextRow][nextCol] = P;

            row = nextRow;
            col = nextCol;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printFloor();

        while (flat[floor][row][col] != F) {
            String input = sc.nextLine().toLowerCase();
            input = input.replace(" ", "");
            if (checkCommand(input)) {
                for (int i = 0; i < input.length(); i++) {
                    if (executeCommand(input.charAt(i))) {
                        printFloor();
                    } else System.out.println("Невозможно выполнить команду");
                }
            } else System.out.println("Некорректный ввод данных");
        }
        System.out.println("Вы дошли до финиша!");
    }
}
