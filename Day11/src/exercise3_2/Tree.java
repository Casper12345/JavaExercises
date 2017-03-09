package exercise3_2;

import exercise2_2.TreeNode;

/**
 * Created by Casper on 09/03/2017.
 */
public class Tree implements IntSortedList {

    private TreeNode root;
    private static StringBuilder toReturn = new StringBuilder();

    public Tree(int toAdd) {
        this.root = new TreeNode(toAdd);
    }

    @Override
    public void add(int add) {
            addHelper(root, add);
    }

    @SuppressWarnings("Duplicates")
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
        return containsHelper(root, contains);

    }

    private boolean containsHelper(TreeNode node, int contains){

        if (contains == node.getInfo()) {
            return true;

        } else if (contains > node.getInfo()) {

            if (node.getRight()== null) {
                return false;

            } else {

                return containsHelper(node.getRight(), contains);
            }

        } else {

            if (node.getLeft() == null) {
                return false;
            } else {
                return containsHelper(node.getLeft(), contains);
            }
        }

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


