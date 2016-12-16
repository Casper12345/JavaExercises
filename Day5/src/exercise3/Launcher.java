package exercise3;
public class Launcher{
	
	public static void main(String[] args){
	
		Matrix myMatrix = new Matrix(10,10);
				
		myMatrix.setElement(5,5,9);
		
		myMatrix.setRow(3,"9989898765");
		
		myMatrix.setColumn(2 ,"8888888888");
		
		System.out.println(myMatrix.toString());
		
		myMatrix.prettyPrint();
	
	
	
	}

}