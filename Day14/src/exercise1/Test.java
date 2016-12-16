package exercise1;

public class Test {
	
	
	public static void main(String[] args){
		Test t = new Test();
		System.out.println(t.mc(50));
		
		
		
	}
	
	int mc(int n) {
		if (n > 100) {
			System.out.println(n + " f"); 
			return n - 10; 
		} else {
			System.out.println(n + " s");
			return mc(mc(n+11));
		}
	}
	
	
	// m(61) 
	// m(m(72))
	// m(72)
	// m((83))
	// m(83)
	// m(m(94)) = m(105)
	// m(105)= m(95) 
	// m
	
}


