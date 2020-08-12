package smg.Vsoapmac.Algorithm.Binary_Tree;

/**
 * Tree接口
 */
public interface Tree<T> {
    public int count = 0;
    /**
     * 查询
     */
    public Node<T> find(T data);

    /**
     * 插入
     */
    public boolean insert(T data);

    /**
     * 删除
     */
    public boolean delete(T data);

    /**
     * 计算节点个数
     */
    public int count();
}
