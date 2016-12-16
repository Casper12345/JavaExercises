print "Input first number: ";
String firstString = System.console().readLine();
int firstNumber = Integer.parseInt(firstString);

print "Input second number: ";
String secondString = System.console().readLine();
int secondNumber = Integer.parseInt(secondString);

int counter;
int remainder = firstNumber;

if (secondNumber != 0){
	
	while(remainder>=secondNumber){
	
		remainder -= secondNumber;
	
		counter = counter +1;
		
		}
		
} else {
	
	println "cannot devide by 0";
	
	} 



if (secondNumber != 0){

	println "the number is: "+counter+" the remainder is: "+remainder; 

}
