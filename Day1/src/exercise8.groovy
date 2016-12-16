def sequence = [];

boolean controller = false; 

while(!controller){
	
	print "enter numbers(end sequence with -1): ";
	int numbers = Integer.parseInt(System.console().readLine())
	
	if(numbers != -1){
	
		sequence.add(numbers);
		println sequence;
	
	} else {
	
		controller = true;
	
	}
	
}


def sortedList = sequence.sort();

println sortedList[-1];
 




