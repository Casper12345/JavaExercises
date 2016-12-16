package exercise2;

public class ExerciseTwo{
	
	public static void main(String[] args){
		
		System.out.println(fib(8));
		
		
	}
	
		public static int fib(int n) {
			if ((n == 1) || (n == 2)) {
			
			return 1;
		
			} else {
		
				int result = fib(n-1) + fib(n-2); // method calls itself
				return result;
		
			}
		}
		
		
		public static int fibTwo(int n){
			
			return 1;
			
			
		}

}
