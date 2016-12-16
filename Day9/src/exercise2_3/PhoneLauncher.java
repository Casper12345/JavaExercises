package exercise2_3;

public class PhoneLauncher{
		
		public static void main(String[] args){
			
			exercise2_1.PhoneLauncher p = new exercise2_1.PhoneLauncher();
			
			p.Launcher();
			
			
		}	
		
		public void Launcher(){
			
			MobilePhone myPhone = new SmartPhone();
			
			myPhone.call("123456789");
			
			myPhone.ringAlarm("9.00");
			
			myPhone.playGame("Snake");
			
			myPhone.printLastNumbers();
			
			// the solution is upcasting myPhone to a SmartPhone
			
			((SmartPhone)myPhone).browseWeb("hello");
			
			((SmartPhone)myPhone).findPosition();
			
			testPhone(myPhone);
			
			
		}
		
		public void testPhone(Phone inputPhone){
			
			
			inputPhone.call("1456789");
			
			// I can only call the methods corresponding to the level we are on. 
			
			//inputPhone.ringAlarm("9.00");
			
			//inputPhone.playGame("Snake");
			
			//inputPhone.printLastNumbers();
						
			//inputPhone.browseWeb("hello");
			
			//inputPhone.findPosition();
			
		}
	
	
	
	
}