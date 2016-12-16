// user input

print "Please write a text: ";
String userInput = System.console().readLine();

boolean flag = false;

def countingList = [];

while (flag != true){
	
	
	print "Which letter would you like to count now?";
	String userLetter = System.console().readLine();
	
	if(countingList.contains(userLetter) != true){
		
		int counter = userInput.count(userLetter);

		println "There are "+counter+" in your text"; 

		countingList.add(userLetter);
				
		
	} else {
	
		flag = true;
		
		println "Repeated character. Exiting the program...";
		
		println "Thank you for your cooperation. Good bye!";	
	
	}
	
		
}



