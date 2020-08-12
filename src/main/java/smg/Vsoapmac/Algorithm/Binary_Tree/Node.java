package smg.Vsoapmac.Algorithm.Binary_Tree;

/**
 * 二叉树节点类
 */
public class Node<T> {
    public T data;
    public Node<T> leftNode;
    public Node<T> rightNode;

    public Node(T key){
        this.data = key;
    }
}
