package Demo_work_12;

public class FiloQueue<T> implements FILO<T> {
    private Node<T> head, tail;
    private int queueSize = 0;

    @Override
    public void offer(T item) {
        if (item == null) return;
        Node<T> node = new Node<>(item);
        if (tail == null) {
            queueSize++;
            tail = head = node;
        } else {
            queueSize++;
            tail.next = node;
            tail = node;
        }
    }

    @Override
    public T poll() {
        if (head == null) return null;
        else {
            queueSize--;
            T value = head.data;
            head = head.next;
            return value;
        }
    }

    public int size() {
        return queueSize;
    }
    //длина очереди

    class Node<G extends T> {
        G data;
        Node<G> next;

        Node(G data) {
            this.data = data;
        }
    }
}
