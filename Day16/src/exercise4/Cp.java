package exercise4;

import java.io.*;
public class Cp {

	public static void main(String[] args) {
		
		Cp cp = new Cp();
		cp.launch(args);
		
	}
	
	public void launch(String[] args) {
		
		String name1 = args[0];
		String name2 = args[1];
		
		File file1 = new File("./" + name1);
		File file2 = new File("./" + name2);
		
		if (file1.exists()) {
			
			if (file2.exists()) {
				System.out.println("File already exists with " + name2 +  
				". Would you like to overwrite it? Y/N");
				String input = System.console().readLine();
				if (input.equals("Y")) {
					
					System.out.println("Overwriting file...");
				
				} else if (input.equals("N")) {
					System.out.println("Process Terminated.");
				}
			}else{
				System.out.println("second file does not exist");
				File newFile = new File("./" + name2 );
				
				try {
					newFile.createNewFile();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
					
				try (BufferedReader in = new BufferedReader(new FileReader(file1))) {
					
					BufferedWriter out = new BufferedWriter(new FileWriter(newFile));
					String line;
					
					while ((line = in.readLine()) != null) {
						out.write(line);	
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		} else {
			System.out.println("The first file does not exist");
		}
	}
}
