import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Hash<K, V> {
    ArrayList<LinkedList<KV<K, V>>> buckets = new ArrayList<>();

    public Hash() {
        for (int a = 0; a < 256; a++)
            buckets.add(new LinkedList<KV<K, V>>());
    }

    public static void main(String[] args) {
        Hash<String, Point> hash = new Hash<>();
        hash.put("bob", new Point(4, 6));
        hash.put("blab", new Point(10, 12));
        System.out.println(hash.get("bob"));
        System.out.println(hash.get("blab"));
    }

    private void put(K key, V value) {
        buckets.get(key.hashCode() & 0xFF).add(new KV<>(key, value));
    }

    public V get(K key) {
        for (KV<K, V> kv: buckets.get(key.hashCode() & 0xFF))
            if (kv.key.equals(key))
                return kv.value;
        throw new IllegalStateException();
    }

    static class KV<K, V> {
        private final K key;
        private final V value;

        public KV(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
