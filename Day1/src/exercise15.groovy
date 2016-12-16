
int numberToGuess = Math.abs(1000 * Math.random())

println "Try to guess my number!";

boolean controller = false;

int counter = 0;

while(!controller){
	
	counter++
	
	print "Tell me a number: ";
	int inputNumber = Integer.parseInt(System.console().readLine())

	if(inputNumber > numberToGuess){

		println "No! My number is lower."; 

	} else if (inputNumber < numberToGuess) {

		println "No! My number is higher. ";

	} else if (inputNumber == numberToGuess) {

		println "CORRECT!";
		controller = true;
	
	}

}

println "You needed " + counter + " guesses"

