print "Input first number: ";
double firstNumber = Double.parseDouble( System.console().readLine());
println firstNumber;

print "Input second number: ";
double secondNumber = Double.parseDouble( System.console().readLine());
println secondNumber;

println "Select: "
print "Add(a)" + " " + "Subtract(s)" + " " + "Multiply(m)" + " " + "Subtract(st)";
String menuInput = System.console().readLine();

if (menuInput == "a") {
	
	println firstNumber + secondNumber;
	
} else if (menuInput == "s"){
	
	println firstNumber - secondNumber;

} else if (menuInput == "m"){

	println firstNumber * secondNumber;	

} else if (menuInput == "st"){

	println firstNumber / secondNumber;

}