println args[0]; 

if  (args[0].indexOf("+") == 1){

		def Splitted = args[0].tokenize("+");
	
		println Integer.parseInt(Splitted[0])  + Integer.parseInt(Splitted[1]);

		
	} else if(args[0].indexOf("-") == 1){

		def Splitted = args[0].tokenize("-");
	
		println Integer.parseInt(Splitted[0]) - Integer.parseInt(Splitted[1]);

		
	} else if(args[0].indexOf("*") == 1){

		def Splitted = args[0].tokenize("*");
	
		println Integer.parseInt(Splitted[0]) * Integer.parseInt(Splitted[1]);
	
	
	}else if(args[0].indexOf("/") == 1){
		
			def Splitted = args[0].tokenize("/");
		
		if( Splitted[1] != "0"){
		
			println Integer.parseInt(Splitted[0]) / Integer.parseInt(Splitted[1]);
		
		} else {
		
			println "cannot devide by zero";
			
		}
} 







