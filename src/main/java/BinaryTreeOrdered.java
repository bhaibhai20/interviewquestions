import tree.Tree;

import static tree.Tree.leaf;
import static tree.Tree.tree;

public class BinaryTreeOrdered {
    public static void main(String[] args) {
        System.out.println(isOrdered(tree(3, leaf(2), leaf(4))));
        System.out.println(isOrdered(tree(3, tree(1, leaf(0), leaf(2)), tree(5, leaf(4), leaf(6)))));
        System.out.println(isOrdered(tree(3, tree(5, leaf(4), leaf(6)), tree(5, leaf(4), leaf(6)))));
    }

    private static boolean isOrdered(Tree tree) {
        MinMaxIsOrdered minMaxIsOrdered = tree.accept(new Tree.Visitor<MinMaxIsOrdered>() {

            @Override
            public MinMaxIsOrdered tree(int value, Tree left, Tree right) {
                MinMaxIsOrdered leftSummary = left.accept(this);
                MinMaxIsOrdered rightSummary = right.accept(this);
                return new MinMaxIsOrdered(
                        Math.min(Math.min(leftSummary.min, value), rightSummary.min),
                        Math.max(Math.max(leftSummary.max, value), rightSummary.max),
                        leftSummary.isOrdered && rightSummary.isOrdered && leftSummary.max < value && value < rightSummary.min
                );
            }

            @Override
            public MinMaxIsOrdered leaf(int value) {
                return new MinMaxIsOrdered(value, value, true);
            }
        });

        return minMaxIsOrdered.isOrdered;
    }
}
