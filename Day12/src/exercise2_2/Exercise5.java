package exercise2_2;

public class Exercise5{

	
	public static void main(String[] args){
	
		Exercise5 e = new Exercise5();
		e.Launch();
	
	}
	
	public void Launch(){
		
		Maps myMap = new Maps(4);
		
		
		int hashGenerated = HashUtilities.shortHash("dadel".hashCode());
		
		myMap.put(hashGenerated, "dadel");
		/*
		String returnString = myMap.get(hashGenerated);
		
		if(returnString == null){
			System.out.println("String is not in map");
		}else{
			System.out.println(returnString);
		}
		*/
		
		int hashGenerated1 = HashUtilities.shortHash("tot".hashCode());
		
		myMap.put(hashGenerated1, "tot");
		
		int hashGenerated2 = HashUtilities.shortHash("dall".hashCode());
		
		myMap.put(hashGenerated2, "dall");
		
		int hashGenerated3 = HashUtilities.shortHash("masss".hashCode());
		
		myMap.put(hashGenerated3, "masss");
		
		String returnString3 = myMap.get(hashGenerated3);
		
		/*
		if(returnString3 == null){
			System.out.println("String is not in map");
		}else{
			System.out.println(returnString3);
		}
		*/
		
		int hashGenerated4 = HashUtilities.shortHash("pong".hashCode());
		
		myMap.put(hashGenerated4, "pong");
		
		myMap.remove(hashGenerated3);
		
		myMap.printOut();
	
	}






}