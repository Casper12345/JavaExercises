package exercise2;

public class SmartPhone extends MobilePhone {
	
	
	public void browseWeb(String browse){
		
		
		
	}
	
	public void findPosition(){
		
		System.out.println("Your positin is: earth");
		
		
	}
	
	public void call(String number){
		
		char a_char = number.charAt(0);
		char b_char = number.charAt(1);
	
		
		if(a_char == '0' && b_char == '0'){
		
			System.out.println("Calling "+number+" through the internet to save money");
		
		}else{
			super.call(number);
		}	
			
	}
	
	
	
	
	
	
	
}