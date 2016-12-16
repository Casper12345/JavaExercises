package exercise2;

public class ArrayCopier{
	
	public static void main(String[] args){
	
		ArrayCopier myInstance = new ArrayCopier();
		myInstance.launch();
	

	}

	
	// launch method

	public void launch(){
		
		// instance one
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[] myArray2 = new int[10];
		
		copy(myArray, myArray2);
		
		printArray(myArray2);
		System.out.println();
		
		
		// instance two
		
		int[] myArray3 = {1,2,3,4,5,6,7,8,9,10,11};
		
		int[] myArray4 = new int[6];
		
		copy(myArray3, myArray4);
		
		printArray(myArray4);
		System.out.println();
		
		
		// instance three
		
		int[] myArray5 = {1,2,3,};
		
		int[] myArray6 = new int[6];
		
		copy(myArray5, myArray6);
		
		printArray(myArray6);
		System.out.println();
		
		
		
	}
	
	// print method for arrays
	
	public void printArray(int[] myArray){
		
		for(int i = 0; i < myArray.length; i++){
			
			
		System.out.print(myArray[i]);
			
			
		}
		
	 	
		
	}
	
	// copy function for array
	
	
	public void copy(int[] src, int[] dst){

				
		if(src.length > dst.length){
		
			for(int i = 0; i < dst.length; i++){
			
				dst[i] = src[i];
			}	
			
	
		} else if(src.length < dst.length){ 
		
			for(int k = 0; k < src.length; k++){
			
				dst[k] = src[k];
			
			}	
				
			for (int d = src.length; d < dst.length; d++){
      			
      			dst[d] = 0;
				
			}
			
		
		} else {
		
			for (int j = 0; j < src.length; j++){
			
				dst[j] = src[j]; 	
			
			}	
			
		}
			
						
	}
		

	
	
	
	
		
	
}

