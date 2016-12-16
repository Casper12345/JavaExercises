package exercise1;

public class Calculator{

	public static void main(String[] args) {
			Calculator myInstance = new Calculator();
			myInstance.launch();
	}

	// launch method
	public void launch(){
		add(1,2);
		subtract(2,1);
		multiply(2,2);
		divide(4,2);
		modulus(2,1);
	}

	// add method
	public void add(int i, int j){
		System.out.println(i + j);
	}
	
	// subtract method
	public void subtract(int i, int j){
		System.out.println(i - j);
	}
	
	// multiply method
	public void multiply(int i, int j){
		System.out.println(i * j);
	}
	
	// divide method
	public void divide(int i, int j){
		if(j != 0){
			System.out.println(i / j);
		} else {
			System.out.println("cannot divide by 0");
		}
	}
	
	// modulus method
	public void modulus(int i, int j){
		if(j != 0){
			System.out.println(i % j);
		} else {
			System.out.println("cannot divide by 0");
		}
		
	}
}