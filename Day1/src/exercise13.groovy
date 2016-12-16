
for (int i = 1; i < 1001; i++){  

boolean primeNumber= true; 

	for (int j = 2;  j < i ; j++){ 
	
		if(i%j == 0){
			
			primeNumber = false;
		
			}
	}	
	
	if(i!=1 && primeNumber == true){
	
		println i;
	
		}	
}




		

