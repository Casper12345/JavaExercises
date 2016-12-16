package exercise2_5;

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
			
			MobilePhone aPhone = new MobilePhone();
			
			testPhone(aPhone);
			
			
		}
		
		public void testPhone(Phone inputPhone){
			
			SmartPhone myPhone = (SmartPhone)inputPhone;
			
			// cannot be cast to SmartPhone
			
			myPhone.call("1456789");
			
			
			myPhone.ringAlarm("9.00");
			
			myPhone.playGame("Snake");
			
			myPhone.printLastNumbers();
						
			myPhone.browseWeb("hello");
			
			myPhone.findPosition();
			
		}
	
	
	
	
}