

while (true){

	print "Enter number:";
	String enteredString = System.console().readLine();
	int enteredInteger = Integer.parseInt(enteredString);

	boolean primeNumber= true; 

	int i = 2; 

	while( i < enteredInteger){
	
		if(enteredInteger%i == 0){
			
			primeNumber= false;	
		
		}
		
			i++
	
		}

		if (enteredInteger!=1 && primeNumber == true){
	
			println enteredInteger + " is a prime number";
	
		}else{
	
			println enteredInteger + " is not a prime number";
	
		}



}