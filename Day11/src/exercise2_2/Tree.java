package exercise2_2;

/**
 * Created by Casper on 09/03/2017.
 */
public class Tree implements IntSet {

    private TreeNode root;
    private static StringBuilder toReturn = new StringBuilder();

    public Tree(int toAdd) {
        this.root = new TreeNode(toAdd);
    }

    @Override
    public void add(int add) {
        if(!contains(add)) {
            addHelper(root, add);
        }
    }

    private void addHelper(TreeNode node, int newNumber){

        if (newNumber > node.getInfo()) {

            if (node.getRight() == null) {
                node.setRight(new TreeNode(newNumber));

            } else {
                addHelper(node.getRight(), newNumber);
            }

        } else {

            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(newNumber));
            } else {
                addHelper(node.getLeft(),newNumber);
            }
        }

    }

    @Override
    public boolean contains(int contains) {
        return containsHelper(root, contains, false);

    }

    private boolean containsHelper(TreeNode node, int contains, boolean verbose){

        if (contains == node.getInfo()) {
            if(verbose){
                System.out.println(node.getInfo());
            }
            return true;

        } else if (contains > node.getInfo()) {

            if (node.getRight()== null) {
                if(verbose){
                    System.out.println(node.getInfo());
                }
                return false;

            } else {
                if(verbose){
                    System.out.println(node.getInfo());
                }
                return containsHelper(node.getRight(), contains, verbose);
            }

        } else {

            if (node.getLeft() == null) {
                if(verbose){
                    System.out.println(node.getInfo());
                }
                return false;

            } else {
                if(verbose){
                    System.out.println(node.getInfo());
                }
                return containsHelper(node.getLeft(), contains, verbose);
            }
        }

    }

    @Override
    public boolean containsVerbose(int contains) {
        return containsHelper(root, contains, true);
    }

    @Override
    public String toString() {
        toStringHelper(root);
        return toReturn.toString();
    }

    private void toStringHelper(TreeNode node){

        if (node.getLeft() != null){
            toStringHelper(node.getLeft());
            toReturn.append(",");
        }

        toReturn.append(node.getInfo());

        if (node.getRight() != null) {
            toReturn.append(',');
            toStringHelper(node.getRight());

        }
    }

}
