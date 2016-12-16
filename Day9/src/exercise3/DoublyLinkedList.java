package exercise3;

public class DoublyLinkedList {

	private Node header;

	public void addNode(Node newNode){
		
		Node pointer = header;

		if(header == null){
			
			header = newNode;
		
		} else{
		
			while(pointer.getNextNode() != null){
				
				pointer = pointer.getNextNode();
			
			}
			
			pointer.setNextNode(newNode);
			pointer.getNextNode().setPreviousNode(pointer);
		}
	
	}

	public void printNodesFowards(){
    	
    	Node pointer = header;
    	
    	if(header == null) {
            System.out.println("List is Empty");
            return;
        }

        if(pointer.getNextNode() == null){
    	    System.out.println(pointer.getItem());

    	} else {
            System.out.println(pointer.getItem());

            while(pointer.getNextNode() != null){
    		    pointer = pointer.getNextNode();
                System.out.println(pointer.getItem());

            }
            System.out.println();
        }
    		
    }	

	public void printNodesBackwards(){
    	
    	Node pointer = header;

    	if(header == null){
    		System.out.println("List is Empty");
    		return;
    	}
    	
    	while(pointer.getNextNode() != null ){
    		pointer = pointer.getNextNode();
    	}

    	System.out.println(pointer.getItem());

        while(pointer.getPreviousNode() != null){
            pointer = pointer.getPreviousNode();
            System.out.println(pointer.getItem());
        }
        System.out.println();
    }	

	public boolean deleteNode(Node delete){
        
        Node pointer = header;
		
		if(pointer == null) {

            System.out.println("List is empty");
            return false;
        }

        if(delete.equals(pointer) ){
			
			header = pointer.getNextNode();
			pointer.getNextNode().setPreviousNode(null);
			pointer.setNextNode(null);
			return true;

		}else{
		
			while(!pointer.getNextNode().equals(delete)){
				pointer = pointer.getNextNode();
			
			}

			if(pointer.getNextNode().getNextNode() == null){
				pointer.getNextNode().setPreviousNode(null);
				pointer.setNextNode(null);
				
				return true;
			
			}else{
			
				pointer.getNextNode().getNextNode().setPreviousNode(pointer);
				pointer.setNextNode(pointer.getNextNode().getNextNode());
				return true;
							
			}		
		}		       
    } 
}	
