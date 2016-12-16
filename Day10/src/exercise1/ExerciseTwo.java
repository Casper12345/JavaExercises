package exercise1;

public class ExerciseTwo{
	
	public static void main(String[] args){
		
		ExerciseTwo e = new ExerciseTwo();
		
		System.out.println(e.buggyMethod(8));
		
		
		
		
	}
	
	String buggyMethod(int n) {
		if (n == 0) {
			return "";
		
		}
		
		String converted = Integer.toString(n);
		
		return converted + "" + " " + buggyMethod(n - 2);
	}
	
}