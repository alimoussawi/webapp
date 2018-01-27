package ua.nure.ostpc.sixth.lesson;
class Tree<T extends Number> {
    private Node<T> root;

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void addLeaf(Node<T> node) {
        if (root == null) {
            root = node;
            return;
        }

        if (node.value.intValue() < root.value.intValue()) {
            this.root.left = node;
        } else {
            this.root.right = node;
        }

    }
}

class Node<B> {
    public B value;
    public Node<B> left;
    public Node<B> right;
}
public class GenericExample {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.setRoot(new Node<>());
    }
}
