print "what is the price of the product? ";
double price = Double.parseDouble(System.console().readLine());

println price;
println " ";
println "You can pay in: ";
println "notes (50, 20, 10, 5)"; 
println "coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01)";


print "what is the amount of money paid? ";
double paid = Double.parseDouble(System.console().readLine()); 

println paid +" paid";


double output = price/paid;  

println output;



// notes (50, 20, 10, 5) 

// coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01)


