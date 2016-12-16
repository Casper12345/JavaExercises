package exercise3;

import java.util.*;

public class MeanCounterBeta {
	
	
	public static void main(String[] args){
		
		
		MeanCounterBeta m = new MeanCounterBeta();
		m.meanPrinter();	
	}


	public void meanPrinter(){
		
		int userLength = 0;
		
		List<Integer> userInput = new ArrayList<Integer>();
		
		while(userLength == 0){
			try{
				System.out.print("Enter amount of numbers that you want to enter: ");
				userLength = Integer.parseInt(System.console().readLine()); 
			
			}catch(NumberFormatException ex){
				
				System.out.println("pls input number");
				
			}
		}
		
		
		for(int i = 0; i < userLength; i++){
				
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