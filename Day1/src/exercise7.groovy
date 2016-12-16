print "Enter first number: ";
int firstNumber = Integer.parseInt(System.console().readLine());

print "Enter second number: ";
int secondNumber = Integer.parseInt(System.console().readLine());

print "Enter third number: ";
int thirdNumber = Integer.parseInt(System.console().readLine());

int one;
int two;
int three;

if(firstNumber < secondNumber && firstNumber < thirdNumber) {
	
	one = firstNumber;

} else if(secondNumber < firstNumber && secondNumber < thirdNumber){

	one = secondNumber;
	
} else if(thirdNumber < firstNumber && thirdNumber < secondNumber){

	one = thirdNumber;

}


if(firstNumber == one && secondNumber > thirdNumber){
	
	two = secondNumber;

} else if(firstNumber == one && thirdNumber > secondNumber){

	two = thirdNumber; 

}


if(secondNumber == one && firstNumber > thirdNumber){
	
	two = firstNumber;

}else if(secondNumber == one && thirdNumber > firstNumber){

	two = thirdNumber; 

}


if(thirdNumber == one && firstNumber > secondNumber){
	
	two = firstNumber;

}else if(thirdNumber == one && secondNumber > firstNumber){

	two = secondNumber; 

}


if(firstNumber == one && secondNumber == two ||
   firstNumber == two && secondNumber == one){

	three = thirdNumber;
	
} else if(firstNumber == one && thirdNumber == two ||
   firstNumber == two && thirdNumber == one){

	three == secondNumber;
	
} else if(secondNumber == one && thirdNumber == two || 
    secondNumber == two && thirdNumber == one){


	three == firstNumber;

}

println firstNumber + " " + secondNumber + " " + thirdNumber
