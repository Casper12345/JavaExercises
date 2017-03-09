package exercise2_2;

import org.junit.*;
import static org.junit.Assert.*;

public class FiboTest {
	
	@Test
	public void testMethod() {
		
		Fibo f = new Fibo();
		Fibo g = new Fibo();
		
		assertEquals(g.fib(10), f.fib(10));
		
		
	}
}