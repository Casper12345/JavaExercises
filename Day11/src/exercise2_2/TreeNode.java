package exercise2_2;

/**
 * Created by Casper on 09/03/2017.
 */
public class TreeNode {

    private int info;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int info) {
        this.info = info;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getInfo() {
        return info;
    }
}
