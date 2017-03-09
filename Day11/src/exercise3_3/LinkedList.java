package exercise3_3;
import exercise2_3.Node;

/**
 * Created by Casper on 09/03/2017.
 */
public class LinkedList implements exercise3_2.IntSortedList {

    private Node root;
    private StringBuilder toReturn = new StringBuilder();

    @Override
    public void add(int add) {

        Node pointer = root;
        Node nodeToAdd = new Node(add);

        if (root == null) {
            root = nodeToAdd;
            return;
        }

        if(add  >= pointer.getInfo()) {
            while (pointer.getNextNode() != null  && add >= pointer.getNextNode().getInfo()) {
                pointer = pointer.getNextNode();
            }

            if (pointer.getNextNode() == null) {
                pointer.setNextNode(nodeToAdd);
            }else{
                nodeToAdd.setNextNode(pointer.getNextNode());
                pointer.setNextNode(nodeToAdd);
            }
        }

        if(add < pointer.getInfo()){
            root = nodeToAdd;
            root.setNextNode(pointer);
        }


    }

    @Override
    public boolean contains(int contains) {
        return containsHelper(contains);
    }

    public boolean containsHelper(int contains) {
        boolean toReturn = false;
        Node pointer = root;

        if(root == null){
            return false;
        }else{

            if(pointer.getInfo() == contains){
                return true;
            }

            while (pointer.getNextNode() != null) {
                pointer = pointer.getNextNode();
                if(pointer.getInfo() == contains){
                    toReturn = true;
                }
            }
        }
        return toReturn;
    }


    @Override
    public String toString() {
        Node pointer = root;

        if(root == null){
            toReturn.append("");
        }else{

            toReturn.append(pointer.getInfo());

            while (pointer.getNextNode() != null) {
                toReturn.append(", ");
                pointer = pointer.getNextNode();
                toReturn.append(pointer.getInfo());

            }
        }
        return toReturn.toString();
    }

}
