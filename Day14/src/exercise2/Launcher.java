package exercise2;

public class Launcher {
	
	public static void main(String[] args){
		
		Fibo f = new Fibo();
		long startTime = System.nanoTime(); 
		f.fibMem(Integer.parseInt(args[0]));
		long endTime = System.nanoTime(); 
		System.out.println(endTime-startTime);
		
		//System.out.println(f.fibMem(10));
	
	}



}