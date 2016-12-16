package exercise3;

import java.io.*;
public class Cat {
	
	public static void main(String[] args) throws FileNotFoundException {

		Cat cat = new Cat();
		cat.launch(args);	
		
	}
	
	public void launch(String[] args) throws FileNotFoundException {
		
		String name = args[0];
		File fileHandler = new File("./" + name);
		
		if (fileHandler.exists()) {
			
			BufferedReader in = new BufferedReader(new FileReader("./" + name));
			
			String line;
			
			try {
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException ex) { 
				System.out.println("IO exception caught.");
			}
			
		} else {
			System.out.println("This file does not exist");
		}
		
	}

}