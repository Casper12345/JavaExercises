
print "Give me a number";
int inputNumber = Integer.parseInt(System.console().readLine())


def primeList = [];


for (int i = 1; i < inputNumber + 20; i++){  

boolean primeNumber= true; 

	
	for (int j = 2;  j < i ; j++){ 
	
			if(i%j == 0){
			
				primeNumber = false;
		
			}
	}	
	

	if(i!=1 && primeNumber == true && i +20 > inputNumber && i -20 < inputNumber ){
	
			primeList.add(i);
	
		}
	
}

primeList.sort();

int myNumber = 490;
int distance = Math.abs(primeList[0] - inputNumber);

int idx = 0;
for(int c = 1; c < primeList.size(); c++){
    int cdistance = Math.abs(primeList[c] - inputNumber);
    if(cdistance < distance){
        idx = c;
        distance = cdistance;
    }
}
int theNumber = primeList[idx];



println primeList;
print theNumber;
