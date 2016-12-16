package exercise2;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class SimpleMapTest{


	@Test
	public void testMethod(){
		
		SimpleMap m = new Maps(5);
		
		
		
		String testInput = "hello";
		
		int hashGenerated = HashUtilities.shortHash(testInput.hashCode());
		m.put(hashGenerated, testInput);
		
		String testOutput = m.get(hashGenerated);
		
		assertEquals(testInput,testOutput);
		
		String generated = generateString() 
		
		
	}
	
	public static String generateString(Random rng, String characters, int length){
			
			char[] text = new char[length];
			
			for (int i = 0; i < length; i++){
				text[i] = characters.charAt(rng.nextInt(characters.length()));
			}
			
			return new String(text);
	}









}