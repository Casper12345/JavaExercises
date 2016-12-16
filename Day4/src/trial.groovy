def list = [1,0,1,1,1,1,0,1,1];

def list2 = [];

for(int i = 0; i < list.size(); i++){
	
	for(int j = 0; j <list.size()/2; j++){
	
		println list[j];
	
	}


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