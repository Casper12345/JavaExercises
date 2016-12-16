package exercise5_2;

public class Maps implements SimpleMap{
	
	private static int size = 0;
	
	private Object[][] map;

	public Maps(int lengthOfMap){
	
		this.map = new Object[lengthOfMap][2];
		
		for(int i = 0; i<map.length; i++){
			
			map[i][0] = 1001;
			map[i][1] = "";
		
		}
	}	

	
	public void put(int key, String name){
		
		if(size == map.length){
			
			System.out.println("Map is full");
			return;	
		}	
		
		for(int i = 0; i < map.length; i++ ){
			
			if(size <= map.length && map[i][0].equals(1001)){
				
				map[i][0] = key;
				map[i][1] = name;
				size ++;
				break;
			
			}
					
			
			if(map[i][0].equals(key) && map[i][0] != null){
				System.out.println("Key taken");
				break;
			}		
		}	
	}

	
	public String get(int key){
		
		String toReturn = null;		
	
		for(int i = 0; i < map.length; i++){
			
			if(map[i][0].equals(key)){
				toReturn = map[i][1].toString();	
			}	
		}
		
		if(toReturn == null){
			return null;
		}else{
			return toReturn;
		}
	}

	
	
	public void remove(int key){
		
		for(int i = 0; i < map.length; i++){
			
			if(map[i][0].equals(key)){
				 map[i][1] = null;
			}
			
		}
	
	}

	
	public boolean isEmpty(){
	
		return false;
	} 

	public void printOut(){
		
		for(int i = 0; i<map.length; i++){
			
			for(int k = 0; k < map[i].length; k++){
				System.out.println(map[i][k]);
			}	
		}	
	}

}






