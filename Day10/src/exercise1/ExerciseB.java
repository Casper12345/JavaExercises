package exercise1;

public class ExerciseB {
	
	public static void main(String[] args){
		
		ExerciseB e = new ExerciseB();
		
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