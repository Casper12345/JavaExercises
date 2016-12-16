package exercise6;

public class Launcher{



	public static void main(String[] args){
	
			
		System.out.println("Watch out here the come! Try to bring the plane down!");
		System.out.println();
		
		boolean game = true;
		
		Target myTarget = new Target(4);
		
		
		while(game){ 
			
			
			
			System.out.print("Enter a coordinate X: ");
			int a = Integer.parseInt(System.console().readLine());
			System.out.print("Enter a coordinate Y: "); 
			int b = Integer.parseInt(System.console().readLine());
			System.out.print("Enter a coordinate Z: "); 
			int c = Integer.parseInt(System.console().readLine());
			
			boolean alive = myTarget.fire(a, b, c);
			
			if (alive == true){
			
				game = false; 
			
			}
		
		}
	
	
	}

	
	

}








