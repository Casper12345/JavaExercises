package exercise4;

class RestrictedSmartPhone extends SmartPhone{
	
	
	public RestrictedSmartPhone(String brand) {
		
		super(brand);
	}
	
	public void playGame(String game){
		System.out.println("cannot play");

	}
	
}