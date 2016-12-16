package exercise2_1;

public class MobilePhone extends OldPhone{
	
	private String[] callList = {"29219211", "21921921","93219312","9321312","3213213","312321312","3123121312","123312321",
							  "12332112","132312312"};
	
	
	public void ringAlarm(String alarm ){
		
		System.out.println(alarm);
		
	}
	
	public void playGame(String game){
		
		System.out.println("Playing" + game);
		
		
	}
	
	public void printLastNumbers(){
		
		for(int i = 0; i<callList.length; i++){
		
			System.out.println(callList[i]);
		}
	}
	
	
}