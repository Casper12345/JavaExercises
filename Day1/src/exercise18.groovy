
def pI = [];


print "enter number: "
int n = Integer.parseInt(System.console().readLine())


for(int k = 0; k < n; k++){
	
	double a = 4 * Math.pow(-1, k);
	double b = 2*k+1;
	double c = a/b;

	pI.add(c);	

}


double p = 0;

for(int i =0; i < pI.size(); i++){
	
	 p += pI[i];	

} 


println p;

