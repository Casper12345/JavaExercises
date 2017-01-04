package exercise10;


public class SortedLinkedList {

    private ListNode header;


    public void add(ListNode toAdd){

        ListNode pointer = header;

        if(header == null){
            header = toAdd;
            return;
        }


        if(toAdd.getItem() >= pointer.getItem()) {
            while (pointer.getNextNode().getItem() <= toAdd.getItem() && pointer.getNextNode() != null) {
                pointer = pointer.getNextNode();
            }

            if (pointer.getNextNode() == null) {
                pointer.setNextNode(toAdd);
            }else{
                pointer.setNextNode(pointer.getNextNode().getNextNode());
            }







        }








    }
}
