package exercise1;

public class TreeLauncher{
	 

	public static void main (String[] args){
		
		TreeLauncher t  = new TreeLauncher();
		t.Launcher();
	 
	}
	
	public void Launcher(){
		
		IntegerTreeNode newTree = new IntegerTreeNode(8);
		newTree.add(1);
		newTree.add(3);
		newTree.add(2);
		newTree.add(0);
		newTree.add(5);
		newTree.add(7);
		newTree.add(6);

		//System.out.println(newTree.contains(1));
        //System.out.println(newTree.getMax());
        //System.out.println(newTree.getMin());
        //newTree.recurse();
        System.out.println(newTree.toString());
        //System.out.println(newTree.getReturnString());


	}


}