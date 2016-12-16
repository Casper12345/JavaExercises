// power


int power(int i, int j){
	
	
	return 	Math.pow(i, j);

}

// power2


int power2(int k){

	return power(2, k)

}



// binary2decimal 


void binary2decimal(){
	
	print "Enter a binary number: ";
	String binary = System.console().readLine();
	
	def stringToChar = [];
	def charToInt = [];

	
	for(int i = 0; i < binary.length(); i++) { 
    
    
    	stringToChar.add(binary.charAt(i));
    
	}

	
	for(int j = 0; j < stringToChar.size(); j++){
	
		 charToInt.add(Character.getNumericValue(stringToChar[j]));
	
	}

	
	def charToIntReverse = charToInt.reverse();
	
	
	// the math
	
	long result = 0;
	
	for (int k = 0; k < charToIntReverse.size(); k++){
		

		if(charToIntReverse[k] == 1){
			
			result += power2(k)
			
		} 
		
		
	}
	
	println "Your decimal number is: " + result;
	println " ";	


}


// decimal2binary


void decimal2binary(){
	
	
	print "Enter a decimal number: ";
	int userInput = Integer.parseInt(System.console().readLine());
	
	int inputNumber = userInput;
	
	def remainder = [];
	
	while (inputNumber !=0){
	
		remainder.add(inputNumber % 2);
		inputNumber = inputNumber / 2; 
	
	}
	
	reverseRemainder = remainder.reverse();
	
	String result = reverseRemainder.join("");		

	println "Your binary number is: " + result;
	println " ";  
}


// switch

boolean running = true;
while (running) {
	println "What would you like to do? "
 	println "1 - Convert binary number to decimal";
	println "2 - Convert decimal to binary";
	println "0 - Exit";
	print ": ";
	
	String str = System.console().readLine();
	int option = Integer.parseInt(str);
	
	switch (option) {
	
	case 0: running = false;
		    break;
	
	case 1: binary2decimal(); 
			break;
	
	case 2: decimal2binary();
			break;
	
	default: println "Invalid Option";
	}

}




