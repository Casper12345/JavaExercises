package exercise5_1;

public class Exercise5{
	
	public static void main(String[] args){
		
		Exercise5 e = new Exercise5();
		e.Launch();
		

	}
	
	public void Launch(){

		System.out.println("Give me a string and I will calculate its hash code: ");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
}