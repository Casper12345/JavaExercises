// user input

print "Write a sentence: ";
String userInput = System.console().readLine();


int counter = userInput.count("e");


println "The number of e letters in the sentence is: " + counter;

println "Part two";
println " ";

// user input two


print "Write a sentence: ";
String userInputTwo = System.console().readLine();

print "What letter shall I search for? ";
String userLetter = System.console()readLine();


int counterTwo = userInputTwo.count(userLetter);

println "The number of "+userLetter+" in the sentence is: " +counterTwo;