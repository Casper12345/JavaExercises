package exercise3;

public class PhoneLauncher{
		
		public static void main(String[] args){
			
			PhoneLauncher p = new PhoneLauncher();
			
			p.Launcher();
			
			
		}	
		
		public void Launcher(){
			
			SmartPhone myPhone = new SmartPhone("Samsung");
			
			String myBrand = myPhone.getBrand();
			
			System.out.println(myBrand); 
			
			MobilePhone myMobile = new MobilePhone("Nokia");
			
			System.out.println(myMobile.getBrand());
				
			myPhone.playGame("Tetris");
		}
	
	
	
	
	
}