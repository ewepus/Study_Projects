package Demo_work_12;

public interface FILO<T> {
    void offer(T item);
    T poll();
    int size();
}
