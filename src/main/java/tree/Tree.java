package tree;

public abstract class Tree {
    private Tree() {
    }

    public static Tree tree(final int value, final Tree left, final Tree right) {
        return new Tree() {
            @Override
            public <T> T accept(Visitor<T> visitor) {
                return visitor.tree(value, left, right);
            }
        };
    }

    public static Tree leaf(final int value) {
        return new Tree() {
            @Override
            public <T> T accept(Visitor<T> visitor) {
                return visitor.leaf(value);
            }
        };
    }

    public abstract <T> T accept(Visitor<T> visitor);

    public interface Visitor<T> {
        T tree(int value, Tree left, Tree right);
        T leaf(int value);
    }
}
