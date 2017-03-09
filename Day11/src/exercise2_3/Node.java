package exercise2_3;

/**
 * Created by Casper on 09/03/2017.
 */
public class Node {

    private int info;
    private Node nextNode;

    public Node(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
