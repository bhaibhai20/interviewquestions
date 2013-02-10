package list;

public class List {
    static <T> Node<T> getFromEnd(Node<T> head, int i) {
        Node<T> node = head;
        Node<Node<T>> reverse = null;
        while (node != null) {
            reverse = new Node<>(node, reverse);
            node = node.next;
        }
        while (reverse != null && reverse.next != null && i > 0) {
            reverse = reverse.next;
            i--;
        }
        return reverse == null ? null : reverse.value;
    }

    public static void main(String[] args) {
        System.out.println(getFromEnd(new Node<>(3, new Node<>(4, null)), 0).value);
        System.out.println(getFromEnd(new Node<>(3, new Node<>(4, null)), 1).value);
    }
}
