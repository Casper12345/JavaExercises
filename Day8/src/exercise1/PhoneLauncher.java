package exercise1;

public class PhoneLauncher{
		
		public static void main(String[] args){
			
			PhoneLauncher p = new PhoneLauncher();
			
			p.Launcher();
			
			
		}	
		
		public void Launcher(){
			
			SmartPhone mySmartPhone = new SmartPhone();
			
			mySmartPhone.call("12235542");
			
			mySmartPhone.ringAlarm("9.00");
			
			mySmartPhone.playGame("Tetris");
			
			mySmartPhone.printLastNumbers();
			
			mySmartPhone.findPosition();
		}
	
	
	
	
	
}