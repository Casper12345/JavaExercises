print "Enter Number: ";
String userNumber = System.console()readLine();


// boolean hexadecimal = false;

def inputList = [];

for(int i = 0; i < userNumber.length(); i++ ){

	inputList.add(userNumber.charAt(i));

}

if ( inputList[0] == '0' && inputList[1] == 'x' ){
		
	for(int j = 2; j < inputList.size(); j++  ){
	
		println inputList[j];
	
	} 



} else if (inputList[0] == '0' || inputList[0] == '1') {
		
		println binary2hexdecimal(inputList);
		
		
		
}


def partition(array, size) {
    
    def partitions = []
    int partitionCount = array.size() / size

    partitionCount.times { partitionNumber ->
        def start = partitionNumber * size 
        def end = start + size - 1
        partitions << array[start..end]    
    }

    if (array.size() % size) partitions << array[partitionCount * size..-1]
    return partitions    
}

println partition(list, 4)




int binary2hexdecimal(list = []){
	
	def charToInt = [];
	
	for(int j = 0; j < list.size(); j++){
	
		 charToInt.add(Character.getNumericValue(list[j]));
	
	}

	
	def charToIntReverse = charToInt.reverse();
	
	// call partition
	
	
	def part = partition(charToIntReverse, 4);
	
	
	// the math
	
	int result = 0;
	
	def resultList = [];
	
	for (int l = 0; l < part.size(); l++){
		
		for (int k = 0; k < part[l].size(); k++){
		
			if(part[k] == 1){
			
				result += Math.pow(2,k);
			
			} 
		
		resultList.add(result)
		
		}
			
	
		
	}
	
	println resultList[1]
	
	return resultList[0];


}