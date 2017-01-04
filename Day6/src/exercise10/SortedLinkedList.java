package exercise10;


public class SortedLinkedList {

    private ListNode header;

    public static void main(String[] args) {
        SortedLinkedList s = new SortedLinkedList();

        ListNode first = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(10);
        ListNode seventh = new ListNode(11);
        ListNode eigth = new ListNode(12);
        ListNode ninth = new ListNode(90);
        ListNode tenth = new ListNode(1);
        ListNode eleventh = new ListNode(18);
        ListNode twelth = new ListNode(-2);
        ListNode thirteenth = new ListNode(12);
        ListNode fourteenth = new ListNode(-19);
        ListNode fifteenth = new ListNode(1);
        s.add(first);
        s.add(second);
        s.add(third);
        s.add(fourth);
        s.add(fifth);
        s.add(sixth);
        s.add(seventh);
        s.add(eigth);
        s.add(ninth);
        s.add(tenth);
        s.add(eleventh);
        s.add(twelth);
        s.add(thirteenth);
        s.add(fourteenth);
        s.add(fifteenth);
        s.Printer();


    }


    public void add(ListNode toAdd){

        ListNode pointer = header;

        if(header == null){
            header = toAdd;
            return;
        }


        if(toAdd.getItem() >= pointer.getItem()) {

            while (pointer.getNextNode() != null  && toAdd.getItem() >= pointer.getNextNode().getItem()) {
                pointer = pointer.getNextNode();
            }

            if (pointer.getNextNode() == null) {
                pointer.setNextNode(toAdd);
            }else{
                toAdd.setNextNode(pointer.getNextNode());
                pointer.setNextNode(toAdd);
            }

        }
        if(toAdd.getItem() < pointer.getItem()){

            header = toAdd;
            header.setNextNode(pointer);

        }

    }

    public void Printer(){

        ListNode pointer = header;

        if(header == null){
            System.out.println("Empty list");
        }

        if(pointer.getNextNode() == null){
            System.out.println(pointer.getItem());
        }
        while (pointer.getNextNode() != null){
            System.out.println(pointer.getItem());
            pointer = pointer.getNextNode();
        }
        System.out.println(pointer.getItem());


    }
}
