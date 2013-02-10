import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {
        Node node = new Node();
        node.next = node;
        System.out.println(hasCycle(node)); // true
        node.next = null;
        System.out.println(hasCycle(node)); // false
        node.next = new Node();
        System.out.println(hasCycle(node)); // false
        node.next.next = node;
        System.out.println(hasCycle(node)); // true
    }

    static class Node {
        Node next;
    }

    static boolean hasCycle(Node node) {
        Set<Node> hash = new HashSet<>();
        hash.add(node);
        while ((node = node.next) != null) {
            if (hash.contains(node))
                return true;
            hash.add(node);
        }
        return false;
    }
}
