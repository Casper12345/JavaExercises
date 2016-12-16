// total amount borrowed

print "Input the total amount borrowed: "; 
double totalAmountBorrowed = Double.parseDouble(System.console().readLine());

// number of years to pay it back

print "Input the number of years to pay it back: "; 
double numberOfYears = Double.parseDouble(System.console().readLine());


// interest rate

print "Input the interest rate in percent: "; 
double interestRate = Double.parseDouble(System.console().readLine());



// total amount to be paid


double total = totalAmountBorrowed * ( 1 + (interestRate/100) );


double totalAmountPaid = numberOfYears * (total - totalAmountBorrowed)+totalAmountBorrowed;


println "The total amount to be paid back is: " + totalAmountPaid; 

// money to be paid back every year


double paidBackYear = totalAmountPaid/ numberOfYears;

println "The amount to be paid back every year is: " + paidBackYear


// number of years til only the capital remains


double yearsTillCapital = (totalAmountPaid - totalAmountBorrowed)/paidBackYear


println "The number for years till the interest is paid is: " + yearsTillCapital;



