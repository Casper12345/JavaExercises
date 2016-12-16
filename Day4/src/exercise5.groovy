class Point{
	
	double x;
	double y; 


}

// distanceTo

double distanceTo(Point pointOne, Point pointTwo){

	
	return Math.sqrt( (Math.pow((pointOne.x - pointTwo.x) , 2)) 
	+ (Math.pow((pointOne.y - pointTwo.y), 2)) );

}


// distanceToOrigin

double distanceToOrigin(pointOne, origin){

	return distanceTo(pointOne, origin)

		
}

// change point one value

void moveTo(double x, double y){

	pointOne.x = x;
	pointOne.y = y;

}

// move to point

void moveTo(Point movePoint){
	
	pointOne.x = movePoint.x;
	pointOne.y = movePoint.y;


}

// clone

Point clone(Point clonePoint){

	point = new Point();
	point.x = clonePoint.x;
	point.y = clonePoint.y;

	return point; 
}


// opposite

Point opposite(Point oppositePoint){
	
	point = new Point();
	point.x = oppositePoint.x * -1;
	point.y = oppositePoint.y * -1;
	
	return point;
}



// defining the points


pointOne = new Point();

print "Enter first point(x): ";
pointOne.x = Double.parseDouble(System.console().readLine());

print "Enter first point(y): ";
pointOne.y = Double.parseDouble(System.console().readLine()); 


pointTwo = new Point();

print "Enter second point(x): ";
pointTwo.x = Double.parseDouble(System.console().readLine());

print "Enter second point(y): ";
pointTwo.y = Double.parseDouble(System.console().readLine()); 


// distance to

println "The distance to second point is: " + distanceTo(pointOne, pointTwo);

// distance to origin

origin = new Point();

origin.x = 0;
origin.y = 0; 

println "The distance to origin is: " + distanceToOrigin(pointOne, origin);


// move to 

println "Give first point new coordinates";

print "new cordinate(x)";
double newOneX = Double.parseDouble(System.console().readLine());

print "new cordinate(y)";
double newOneY = Double.parseDouble(System.console().readLine());

moveTo(newOneX, newOneY);

println "First point has been moved to: " + "(" + pointOne.x +", " + pointOne.y + ")";

// move to point

println "Moving first point once again";

movePoint = new Point();

movePoint.x = 3;
movePoint.y = 4;

moveTo(movePoint);

println "First point has been moved again to: " + "(" + pointOne.x +", " + pointOne.y + ")";


// clone

println "Now cloning point";

clonePoint = clone(movePoint);

println "The cloned point is: " + "(" + clonePoint.x +", " + clonePoint.y + ")";


// opposite

println "Creating opposite point";

oppositePoint = opposite(clonePoint);

println "The opposite point is: " + "(" + oppositePoint.x +", " + oppositePoint.y + ")";









