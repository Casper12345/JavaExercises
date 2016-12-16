print "Write some text: ";
String userText = System.console().readLine();


print "Write a short string: ";
String userString = System.console().readLine();


for(int i = 0; i < userString.length(); i++){
	
	for(int j = 0; j <userText.length(); j++){
	
		if(userString.charAt(i) == userText.charAt(j)){
		
			println userText.charAt(j);
	
		}
	
	}
}







// charAt() and length()
