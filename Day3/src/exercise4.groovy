// creating class 
class Point {
	double x;
	double y;
	
}

// first instance of Point

first = new Point();

print "Point one(x): "
first.x = Double.parseDouble(System.console().readLine()); 

print "Point one(y): "
first.y = Double.parseDouble(System.console().readLine()); 


// second instance of Point

second = new Point();

print "Point two(x): "
second.x = Double.parseDouble(System.console().readLine()); 

print "Point two(y): "
second.y = Double.parseDouble(System.console().readLine()); 



// third instance of Point

third = new Point();

print "Point three(x): "
third.x = Double.parseDouble(System.console().readLine()); 

print "Point three(y): "
third.y = Double.parseDouble(System.console().readLine()); 





// calculate distance first to second 

double firstToSecond = Math.sqrt( (Math.pow((first.x - second.x) , 2)) + (Math.pow((first.y - second.y), 2)) );


println "The distance from point one to point two is: " + firstToSecond;


// calculate distance first to third 

double firstToThird = Math.sqrt( Math.pow(first.x - third.x , 2) + Math.pow(first.y - third.y, 2) );

println "The distance from point one to point three is: " + firstToThird;


// calculate distance se to third 

double secondToThird = Math.sqrt( Math.pow(second.x - third.x , 2) + Math.pow(second.y - third.y, 2) );

println "The distance from point two to point three is: " + secondToThird;


// compare distances 


if (firstToSecond > firstToThird && firstToSecond > secondToThird){

	println "The distance between point one and point two is the longest";
	
} else if (firstToThird > firstToSecond && firstToThird > secondToThird ){

	println "The distance between point one and point three is the longest";
	
	
} else if (secondToThird > firstToSecond && secondToThird > firstToThird){


	println "The distance between point two and point theree is the longest"; 

}


