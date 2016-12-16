
String userInput = "11,709.67";

println "The number is: " + userInput; 

def splitOne = userInput.tokenize(",");

def splitTwo = splitOne[1].tokenize(".");

int firstPart = Integer.parseInt(splitOne[0]);


//int decimal = Integer.parseInt(splitTwo[1]);


// first division

int divideFirstPart = firstPart/2;
int remainderFirstPart = firstPart%2;


// change to string

String remainderFirstPartString = remainderFirstPart.toString();

int secondPart =  Integer.parseInt(remainderFirstPartString + splitTwo[0]);



// second division 

int divideSecondPart =  secondPart/2;
int remainderSecondPart = secondPart%2;


// change to string

String remainderSecondPartString = remainderSecondPart.toString();

int thirdPart = Integer.parseInt(remainderSecondPartString + splitTwo[1]);



// third division 

int divideThirdPart = thirdPart/2;
int remainderThirdPart = thirdPart%2;


int lastDecimal = 0;

if (remainderThirdPart == 1){

	lastDecimal = 5;

}


// result as string

String firstPartResult = divideFirstPart.toString();
String secondPartResult = divideSecondPart.toString();
String thirdPartResult = divideThirdPart.toString();
String lastDecimalResult = lastDecimal.toString();

println firstPartResult + "," + secondPartResult + "." + thirdPartResult + lastDecimalResult






 
 

