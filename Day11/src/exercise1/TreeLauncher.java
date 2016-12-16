package exercise1;

public class TreeLauncher{
	 

	public static void main (String[] args){
		
		TreeLauncher t  = new TreeLauncher();
		t.Launcher();
	 
	}
	
	public void Launcher(){
		
		IntegerTreeNode newTree = new IntegerTreeNode(5);
		newTree.add(4);
		newTree.add(0);
		newTree.add(9);
		newTree.add(199);
		newTree.add(900012);
		newTree.add(-1);
		newTree.add(-123);

		System.out.println(newTree.contains(1));
        System.out.println(newTree.getMax());
        System.out.println(newTree.getMin());

	}


}