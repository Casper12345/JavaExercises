
boolean flag = true;
boolean controller = false;
def test = [];



while(!controller){
	
	
	
	print "Enter number: ";
	int input = Integer.parseInt(System.console().readLine());
	
	
	
	if(input != -1){
			
		test.add(input);
		test.sort();

		} else {
	
		controller = true;
		
		}
	}
		
	 
for(int i = 0; i < test.size() - 1; i++) {
		  
	if (test[i] + 1 != test[i + 1]) {
			
			flag = false;
		}
				
	}

if (flag == true){

		println "yes";

	} else {

		println "no";
    }


	

		
		
		
		
