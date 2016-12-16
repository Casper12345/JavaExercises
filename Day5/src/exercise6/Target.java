package exercise6;

public class Target{
	
	public int[][][] ThreeDArray = null; 
 	
	

	Target(int x){
		
		System.out.println("we are in constructor");
	
		this.ThreeDArray = new int[x][x][x];
		
		for(int i = 0; i < ThreeDArray.length; i++){
		
			for(int k = 0; k < ThreeDArray[0].length; k++){
			
				for(int j = 0; j < ThreeDArray[0][0].length; j++){
				
				
					this.ThreeDArray[i][k][j] = 0;
					this.ThreeDArray[i][k][j] = 0;
				
				}
			
			}
		
		}
	
	}
	
	public void init(){
	
		int a = this.ThreeDArray.length;
		
		int r1 = (int) Math.abs(a * Math.random());
		int r2 = (int) Math.abs(a * Math.random());
		int r3 = (int) Math.abs(a * Math.random());
		
		
		for(int i = 0; i < ThreeDArray.length; i++){
		
			for(int k = 0; k < ThreeDArray[0].length; k++){
			
				for(int j = 0; j < ThreeDArray[0][0].length; j++){
					
					this.ThreeDArray[i][k][j] = 0;
					
				}
			
			}
	
		}
			
		
		this.ThreeDArray[r1][r2][r3] = 1;
		
	}
	
	
	public boolean fire(int a, int b, int c){
		
		int [] targetPosition = new int[3];
		
		for(int i = 0; i < ThreeDArray.length; i++){
		
			for(int k = 0; k < ThreeDArray[0].length; k++){
			
				for(int j = 0; j < ThreeDArray[0][0].length; j++){
					
						if(ThreeDArray[i][k][j] == 1){
						
							targetPosition[0] = i;
							targetPosition[1] = k;
							targetPosition[2] = j;						
						
						}
				}	    	  
			}
		}	
	
		
		Helper hit = new Helper(Helper.Result.HIT);
        Helper failLeft = new Helper(Helper.Result.FAIL_LEFT);
        Helper failRight = new Helper(Helper.Result.FAIL_RIGHT);
        Helper failHigh = new Helper(Helper.Result.FAIL_HIGH);
        Helper failLow = new Helper(Helper.Result.FAIL_LOW);
        Helper failShort = new Helper(Helper.Result.FAIL_SHORT);
        Helper failLong = new Helper(Helper.Result.FAIL_LONG);   
        Helper outOfRange = new Helper(Helper.Result.OUT_OF_RANGE);
     	
     	if(a == targetPosition[0] && b == targetPosition[1] && c == targetPosition[2]){
		
			 hit.resultSwitch();
			 return true; 
			
		}else if(a == targetPosition[0] && b == targetPosition[1] && c < targetPosition[2]){
		
			failRight.resultSwitch();
			return false;
		
		}else if(a == targetPosition[0] && b == targetPosition[1] && c > targetPosition[2]){	
	
			failLeft.resultSwitch();
			return false;	
		 
		 }else if (a == targetPosition[0] && b < targetPosition[1]){
		 	
			 failHigh.resultSwitch();
			 return false;
			
		 }else if (a == targetPosition[0] && b > targetPosition[1]){
		
		 	failLow.resultSwitch();
		 	return false;
			
		 }else if (a+1 == targetPosition[0] && b == targetPosition[1] || c == targetPosition[2]){
		 
		 	failShort.resultSwitch();
		 	return false;
		 		
		 }else if (a-1 == targetPosition[0] && b == targetPosition[1] || c == targetPosition[2]){
		 	
		 	failLong.resultSwitch();
		 	return false;
		 
		 } else if (a != targetPosition[0] && b != targetPosition[1] && c != targetPosition[2]){
		 	
		 	outOfRange.resultSwitch();
		 	return false;
		 
		 }
		
		// targetPostion[0]
		// [i] decides which table
		// [k] decides the row
		// [j] decides the coloumn
	
		return false;
	}
	
	
	
	public void printer(){
	
		for(int i = 0; i < ThreeDArray.length; i++){
		
			for(int k = 0; k < ThreeDArray[0].length; k++){
			
				for(int j = 0; j < ThreeDArray[0][0].length; j++){
				
					System.out.print(this.ThreeDArray[i][k][j]);
				
				}
				
				System.out.println();
			}
			
			System.out.println();			
		}

	}
	
	
	




}