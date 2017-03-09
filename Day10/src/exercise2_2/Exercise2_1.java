package exercise2_2;

public class Exercise2_1 {
	
	public static void main(String[] args){
		
		
		System.out.println(factorial(4));
		System.out.println(factorialRecursive(4));
		System.out.println( "=" + factorialRecursiveTwo(4));
	}
	
	public static int factorial(int n) {
		if (n == 1) {
			
			return 1;
		
		} else {
		
		int result = n * factorial(n-1);
	
		return result;
		
		}
	}

	// n! = 4 * (4 − 1) * (4 − 2) * (4 − 3) * (4 − 4) 

	public static int factorialRecursive(int n){
		int result = 1;
		
		for(int i = n; i > 0; i--){
			
			if(n == 1){
				return 1;
			}
			
			result = result * i;
		}
		
		return result;
		
	}
	
	public static int factorialRecursiveTwo(int n){
		
		int result = n;
		System.out.print(n + " *"); 
		for(int i = 1; i<n-1; i++){
			
			result = result * (n-i);
			System.out.print("(" + n + "-" + i + ") *");
		}
		System.out.print("(" + n + "-" + (n-1) + ")");
		return result;
	}
}
