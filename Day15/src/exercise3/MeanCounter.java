package exercise3;

import java.util.*;

public class MeanCounter {
	
	
	public static void main(String[] args){

		MeanCounter m = new MeanCounter();
		m.meanPrinter();
	}
	
	
	public void meanPrinter(){
		
		List<Integer> userInput = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
            Scanner s = new Scanner(System.in);

            try {
				System.out.print("Input number: ");
				userInput.add(s.nextInt());
				
			}catch (InputMismatchException ex){
                System.out.println("Pls input a number");
			} 
				
		}	
			
		double inputAdded = 0;
			
			
		for(int j = 0; j < userInput.size(); j++){
				
			inputAdded += userInput.get(j);
				
				
		}
			
		System.out.println(inputAdded/userInput.size());

		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
