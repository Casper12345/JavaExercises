package exercise1;

import java.io.File;
public class Filenames {
		
		public static void main(String[] args){
			
			Filenames f = new Filenames();
			
			f.fileHandler();
			
			
			
		}
		
		public void fileHandler(){
				
			File fileHandle = new File(".");
		
			String[] importList = fileHandle.list();
			
			System.out.println(importList[0]);
		
		
		
		
		
		//System.out.println(list[0]);
		
		//if(list.length == 0){
			
			//System.out.println("is empty");
			
		//}else{
			
			//System.out.println("not empty");

		//}
		
			
			
			
			
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
