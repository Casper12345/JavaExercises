package exercise2_1;

public class PhoneLauncher{
		
		public static void main(String[] args){
			
			PhoneLauncher p = new PhoneLauncher();
			
			p.Launcher();
			
			
		}	
		
		public void Launcher(){
			
			SmartPhone myPhone = new SmartPhone();
			
			myPhone.call("123456789");
			
			myPhone.ringAlarm("9.00");
			
			myPhone.playGame("Snake");
			
			myPhone.printLastNumbers();
			
			myPhone.browseWeb("hello");
			
			myPhone.findPosition();
			
			// MobilePhone myPhone = new SmartPhone();

			
		}
	
	
	
	
	
}