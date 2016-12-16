package exercise6;

public class Helper{
	
	Result result;
    
    public Helper(Result result) {
        this.result = result;
    }
    
    public void resultSwitch() {
        switch (result) {
            case HIT:
                System.out.println("You hit it! Well done!");
                break;
                    
            case FAIL_LEFT:
                System.out.println("You missed! The target is to the left!");
                break;
                         
            case FAIL_RIGHT: 
                System.out.println("You missed! The target is to the right!");
                break;
            
            case FAIL_HIGH:
                System.out.println("You missed! The target is lower!");
                break;
            
            case FAIL_LOW:
                System.out.println("You missed! The target is higher!");
                break;
                    
            case FAIL_SHORT:
                System.out.println("You missed! The target is further away!");
                break;
                         
            case FAIL_LONG: 
                System.out.println("You missed! The target is closer!");
                break;
            
            case OUT_OF_RANGE:
                System.out.println("That shot is way out of range. Try harder!");
                break;
              
            default:
                System.out.println("ERROR");
                break;
           
        }
    }
	
	public enum Result{
		
		HIT,
		FAIL_LEFT, 
		FAIL_RIGHT, 
		FAIL_HIGH, 
		FAIL_LOW, 
		FAIL_SHORT, 
		FAIL_LONG, 
		OUT_OF_RANGE
		
	}

}