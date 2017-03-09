package exercise2_3;

/**
 * Created by Casper on 09/03/2017.
 */
public class LinkedList implements exercise2_2.IntSet {

    private Node root;
    private StringBuilder toReturn = new StringBuilder();

    @Override
    public void add(int add) {

        if (!contains(add)) {

            Node pointer = root;

            if (root == null) {
                root = new Node(add);
            } else {
                while (pointer.getNextNode() != null) {
                    pointer = pointer.getNextNode();
                }
                pointer.setNextNode(new Node(add));
            }

        }
    }

    @Override
    public boolean contains(int contains) {
        return containsHelper(contains, false);
    }

    public boolean containsHelper(int contains, boolean verbose) {
        boolean toReturn = false;
        Node pointer = root;

        if(root == null){
            return false;
        }else{

            if(pointer.getInfo() == contains){
                if(verbose){
                    System.out.println(pointer.getInfo());
                }
                return true;
            }

            if(verbose){
                System.out.println(pointer.getInfo());
            }

            while (pointer.getNextNode() != null) {
                pointer = pointer.getNextNode();
                if(pointer.getInfo() == contains){
                    toReturn = true;
                }
                if(verbose){
                    System.out.println(pointer.getInfo());
                }
            }
        }
        return toReturn;
    }

    @Override
    public boolean containsVerbose(int contains) {
        return containsHelper(contains, true);
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
