package exercise10;

/**
 * Created by Casper on 19/12/2016.
 */
public class ListNode {

    private int item;
    private ListNode nextNode;


    public ListNode(int item){
        this.item = item;
    }

    public int getItem(){
        return item;
    }
    public void setNextNode(ListNode nextNode){
        this.nextNode = nextNode;
    }

    public ListNode getNextNode(){
        return nextNode;
    }

}
