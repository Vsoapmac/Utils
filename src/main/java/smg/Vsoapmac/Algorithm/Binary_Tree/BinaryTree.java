package smg.Vsoapmac.Algorithm.Binary_Tree;

public class BinaryTree<T> implements Tree<T> {
    private int count = 0;
    private Node<T> root;
    @Override
    public Node<T> find(T data) {
        return null;
    }

    @Override
    public boolean insert(T data) {
        this.count++;

        //设置根节点
        Node<T> newNode = new Node<T>(data);
        if (root == null) {
            root = newNode;
            return true;
        } else if (root.leftNode == null) {
            root.leftNode = newNode;
            return true;
        } else if (root.rightNode == null) {
            root.rightNode = newNode;
            return true;
        } else if (root.leftNode != null && root.rightNode != null) {
            root = root.leftNode;
            insert(data);
        }
        return false;
    }

    @Override
    public boolean delete(T data) {
        return false;
    }

    @Override
    public int count() {
        return this.count;
    }
}
