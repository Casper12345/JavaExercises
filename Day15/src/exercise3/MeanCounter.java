package exercise3;

import java.util.*;

public class MeanCounter {
	
	
	public static void main(String[] args){
		
		
		MeanCounter m = new MeanCounter();
		
		m.meanPrinter();
		
		
		
	}
	
	
	public void meanPrinter(){
		
		List<Integer> userInput = new ArrayList<Integer>();
		
		for(int i = 1; i < 11; i++){
				
			try {
				System.out.print("Input number: ");
				userInput.add(Integer.parseInt(System.console().readLine()));
				
			}catch (NumberFormatException ex){
			
					System.out.println("pls input a number");
			} 
				
		}	
			
		double inputAdded = 0;
			
			
		for(int j = 0; j < userInput.size(); j++){
				
			inputAdded += userInput.get(j);
				
				
		}
			
		System.out.println(inputAdded/userInput.size());
		
			
		
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
