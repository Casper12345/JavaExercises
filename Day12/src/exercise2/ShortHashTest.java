package exercise2;

import org.junit.*;
import static org.junit.Assert.*;

public class ShortHashTest {
	
	
	@Test
	public void testsMethod() {
		
		HashUtilities h = new HashUtilities();
		
		int i = 0;
		
		while (i<2000){
			
			int a = h.shortHash(i);
			int f = Math.abs(i % 1000);
			assertEquals(a,f);
			i++;	
		}
		
		
	}
}