package exercise2;

import java.io.File;
public class Mkdir {

	public static void main(String[] args) {
	
		Mkdir mkdir = new Mkdir();
		mkdir.launch(args);
	
	}
	
	public void launch(String[] args) {
	
		String name = args[0];
		File fileHandler = new File("./" + name);
		fileHandler.mkdir();	
	}

}