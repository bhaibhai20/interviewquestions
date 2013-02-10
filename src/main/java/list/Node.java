package list;

public class Node<T> {
    public final T value;
    public final Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
