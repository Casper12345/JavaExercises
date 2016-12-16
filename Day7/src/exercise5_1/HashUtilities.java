package exercise5_1;

class HashUtilities{
	
	public static int shortHash(int number){
			
		int number2 = number % 1000;
	
		return Math.abs(number2);
		
	}

}