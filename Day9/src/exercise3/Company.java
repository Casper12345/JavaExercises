package exercise3;

public class Company {

    public static void main(String[] args) {
        DoublyLinkedList names = new DoublyLinkedList();
        Node<String> firstEmployeeName = new Node<>("John");
        Node<String> secondEmployeeName = new Node<>("Jim");
        Node<String> thirdEmployeeName = new Node<>("Paul");
        Node<String> fourthEmployeeName = new Node<>("Eric");

        names.addNode(firstEmployeeName);
        names.addNode(secondEmployeeName);
        names.addNode(thirdEmployeeName);
        names.addNode(fourthEmployeeName);

        names.printNodesFowards();
        names.printNodesBackwards();

        names.deleteNode(thirdEmployeeName);
        names.printNodesFowards();
        names.printNodesBackwards();


        DoublyLinkedList nationalInsurance = new DoublyLinkedList();
        Node<Integer> firstEmployeeNI = new Node<>(1232);
        Node<Integer> secondEmployeeNI = new Node<>(321123);
        Node<Integer> thirdEmployeeNI = new Node<>(32112);
        Node<Integer> fourthEmployeeNI = new Node<>(3212);

        nationalInsurance.addNode(firstEmployeeNI);
        nationalInsurance.addNode(secondEmployeeNI);
        nationalInsurance.addNode(thirdEmployeeNI);
        nationalInsurance.addNode(fourthEmployeeNI);

        nationalInsurance.printNodesFowards();
        nationalInsurance.printNodesBackwards();

        nationalInsurance.deleteNode(secondEmployeeNI);
        nationalInsurance.printNodesFowards();
        nationalInsurance.printNodesBackwards();


    }

}
