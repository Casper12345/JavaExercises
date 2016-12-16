package exercise1;

public class Exercise{
	
	public static void main(String[] args){
		
		Exercise e = new Exercise();
		
		e.printNumbers(6);
		
		
		
		
	}
	
	void printNumbers(int n) {
		if (n <= 0) {
			return; // returns to the exact point where it was called from
		}
		
		System.out.println(n);
		printNumbers(n-2); 
		printNumbers(n-3);
		//System.out.println(n);
		
	}
	
	
	
	
	
	
	
	
}