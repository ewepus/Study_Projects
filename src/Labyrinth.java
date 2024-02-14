public class Labyrinth {
    static final byte wall = 9;
    static final int startX = 3, startY = 3; //начальная позиция
    static int[][] labyrinth = new int[][]{
            {9, 9, 9, 9, 9, 9, 9},
            {9, 0, 0, 0, 0, 0, 9},
            {9, 0, 9, 9, 9, 0, 9},
            {9, 0, 9, 0, 9, 0, 9},
            {9, 0, 9, 0, 0, 0, 9},
            {9, 0, 9, 9, 9, 9, 9}
    };
    static final byte start = 0, directionUp = 1, directionRight = 2, directionDown = 3, directionLeft = 4;

    static int reverseDirection(int lastDirection) {
        return switch (lastDirection) {
            case directionUp -> directionDown;
            case directionDown -> directionUp;
            case directionLeft -> directionRight;
            case directionRight -> directionLeft;
            default -> start;
        };
    }

    public static void main(String[] args) {

    }
}
