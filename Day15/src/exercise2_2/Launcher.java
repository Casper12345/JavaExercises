package exercise2_2;

import java.util.*;

public class Launcher {

	
	public static void main(String[] args){
		
		Launcher l = new Launcher();
		
		l.launch(1);
	
	
	}
	
	public void launch(int newElement) {
		
		List<Integer> list = new ArrayList<>();
	
		try {
				

			list.add(newElement);
			 
		
		
		} catch (NullPointerException ex) {
			
			ex.printStackTrace();
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		
		}
	} 
 }
 
 
 

 
 
 