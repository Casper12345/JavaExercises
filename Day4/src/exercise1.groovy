 class UnitMatrix {
 
	int size; // inside UnitMatrix

	
	void setSize(int newSize) {
		this.size = newSize; // inside UnitMatrix.setSize
	}

	
	
	void print() {
		for (int i = 0; i < size; i++) {	//inside UnitMatrix.print first loop and nested loop
			for (int j = 0; j < size; j++){  // inside 	UnitMatrix.print nested loop
				if (i == j) {  					
					println("1 ");
				} else {
					println("0 ");
				}
			}
			println ""
		}
	}
 }

 