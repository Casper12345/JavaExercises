package exercise3;

public class Node<T> {

    private T item;

    private Node nextNode;
	private Node previousNode;
	

	Node(T item){
        this.item = item;
	}

	public T getItem(){
	    return item;
    }

	public Node getNextNode(){
		return nextNode;
	}
	
	public Node getPreviousNode(){
		return previousNode;
	}
	
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(Node previousNode){
		this.previousNode = previousNode;
	}  


}