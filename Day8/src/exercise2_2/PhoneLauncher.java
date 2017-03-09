package exercise2_2;

public class PhoneLauncher{
		
		public static void main(String[] args){
			
			PhoneLauncher p = new PhoneLauncher();
			
			p.Launcher();
			
			
		}	
		
		public void Launcher(){
			
			SmartPhone mySmartPhone = new SmartPhone();
			
			mySmartPhone.call("0072235542");
			
			mySmartPhone.ringAlarm("9.00");
			
			mySmartPhone.playGame("Tetris");
			
			mySmartPhone.printLastNumbers();
			
			mySmartPhone.findPosition();
		}
	
	
	
	
	
}