package Lab_work_12;

public class IntegerStack implements LIFO {
    private int top;
    private final int maxSize;
    private int[] integerStackArray;

    public IntegerStack(int maxSize) {
        if (maxSize > 0) {
            this.maxSize = maxSize;
            integerStackArray = new int[maxSize];
            top = -1;
        } else throw new NegativeArraySizeException("Некорректный размер кучи");
    }

    @Override
    public void push(int element) {
        if (top + 1 < maxSize) {
            integerStackArray[++top] = element;
        } else throw new ArrayIndexOutOfBoundsException("Куча переполнена!");
    }
    //положить наверх

    @Override
    public int pop() {
        if (top >= 0) {
            return integerStackArray[top--];
        }
        throw new ArrayIndexOutOfBoundsException("Куча пуста, нечего вытаскивать");
    }
    //убрать сверху

    public boolean isEmpty() {
        return top == -1;
    }
}
//Last in First out