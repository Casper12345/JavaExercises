package exercise5;

public class Matrix{
	
	
	int[][] twoDArray = null;
	
	
	// constructor
	
	Matrix(int x, int y) { 
		
		this.twoDArray = new int[x][y];
		
		for(int k = 0; k < this.twoDArray.length; k++){
			
			for(int j = 0; j < this.twoDArray[0].length; j++){
			
				this.twoDArray[k][j] = 1;
			
			}	
		}	
	}

	
	// set element method
	public void setElement(int x, int y, int z){
		
		if(this.twoDArray.length > x && this.twoDArray[0].length > y){
			
			this.twoDArray[x][y] = z; 	
			
		} else {
		
			System.out.println("Index out of bounds");
		
		}	
	}
	
	
	// method that sets row
	public void setRow(int x, String myString){
		
		for(int k = 0; k < this.twoDArray.length; k++){
		
			for(int j = 0; j < this.twoDArray[0].length; j++){
			
				if(myString.length() == this.twoDArray[0].length){
					
					char c = myString.charAt(j);
					int a = Character.getNumericValue(c);
					this.twoDArray[x][j] = a;
				
				}
			}		
		}
	}
	
	
	// method that sets column
	public void setColumn(int x ,String myString){
	
		for(int k = 0; k < this.twoDArray.length; k++){
		
			for(int j = 0; j < this.twoDArray[0].length; j++){
			
				if(myString.length() == this.twoDArray.length){
					
					char c = myString.charAt(j);
					int a = Character.getNumericValue(c);
					this.twoDArray[j][x] = a;
				
				}			
			}	
		}	
	} 
	
	
	// to String method
	
	public String toString(){
		// [1,2,3;4,5,6;3,2,1]
		
		String printing = "[";
		
		for(int k = 0; k < this.twoDArray.length; k++){		
				
			for(int j = 0; j < this.twoDArray[0].length; j++){
			
					String c = Integer.toString(twoDArray[k][j]);
					printing += c;
				
			}	
			
			printing += ";";
								 
		}
		
		return printing.substring(0,printing.length()-1) + "]"; 
	}
	
	
	// method that outputs the elements of twoDArray
	public void prettyPrint(){
	
		for(int k = 0; k < this.twoDArray.length; k++){
				
				
			for(int j = 0; j < this.twoDArray[0].length; j++){
			
				System.out.print(this.twoDArray[k][j]);
				
			
			}
		
			System.out.println();
		
		}
	}
}



