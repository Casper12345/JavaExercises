// user input

print "Write a sentence: ";
String userInput = System.console().readLine();

for(int i = 0; i < userInput.length(); i++){

	println userInput.charAt(i);

}

println " ";


def splitSentence = userInput.tokenize(" ");


for(int j = 0; j < splitSentence.size(); j++){

	println splitSentence[j]; 

}




 

