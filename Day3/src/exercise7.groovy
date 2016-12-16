// creating classes 


class Point {
	double x;
	double y;
	
}


class Rectangle { 
  Point upLeft; 
  Point downRight;
	
}
	

// rectangle one


println "Define the first rectangle";

upLeftOne = new Point();

print "Up left point one(x): "
upLeftOne.x = Double.parseDouble(System.console().readLine()); 

print "Up left point one(y): "
upLeftOne.y = Double.parseDouble(System.console().readLine()); 



downRightOne = new Point();

print "Down right point one(x): "
downRightOne.x = Double.parseDouble(System.console().readLine()); 

print "Down right point one(y): "
downRightOne.y = Double.parseDouble(System.console().readLine()); 


println "Define the second rectangle";


// rectangle two


println "Define the second rectangle";

upLeftTwo = new Point();

print "Up left point two(x): "
upLeftTwo.x = Double.parseDouble(System.console().readLine()); 

print "Up left point two(y): "
upLeftTwo.y = Double.parseDouble(System.console().readLine()); 



downRightTwo = new Point();

print "Down right point two(x): "
downRightTwo.x = Double.parseDouble(System.console().readLine()); 

print "Down right point two(y): "
downRightTwo.y = Double.parseDouble(System.console().readLine()); 



// create instance of rectangle one


firstRectangle = new Rectangle(); 

firstRectangle.upLeft = upLeftOne;

firstRectangle.downRight = downRightOne;


// create instance of rectangle two


secondRectangle = new Rectangle(); 

secondRectangle.upLeft = upLeftTwo;

secondRectangle.downRight = downRightTwo; 


// create searchpoint


searchPoint = new Point();

print "New Point(x): "
searchPoint.x = Double.parseDouble(System.console().readLine()); 

print "New Point(y): "
searchPoint.y = Double.parseDouble(System.console().readLine()); 


// calculate if search point is in the first rectangle


boolean isInFirstRectangle = false;


if(searchPoint.x >= firstRectangle.upLeft.x &&
  		searchPoint.x <= firstRectangle.downRight.x &&
   		searchPoint.y >= firstRectangle.downRight.y &&
   		searchPoint.y <=  firstRectangle.upLeft.y){
   
	
	isInFirstRectangle = true;

}

// calculate if search point is in the second rectangle


boolean isInSecondRectangle = false;


if(searchPoint.x >= secondRectangle.upLeft.x &&
  		searchPoint.x <= secondRectangle.downRight.x &&
   		searchPoint.y >= secondRectangle.downRight.y &&
   		searchPoint.y <=  secondRectangle.upLeft.y){
   
	
	isInSecondRectangle = true;

}

// print result

if (isInFirstRectangle == true && isInSecondRectangle == true){

	println "New Point is both inside first and second rectangle";


} else if (isInFirstRectangle == true && isInSecondRectangle == false){

	println "New Point is inside first rectangle, but not in second rectangle";


} else if (isInFirstRectangle == false && isInSecondRectangle == true){

	println "New Point is inside second rectangle, but not in first rectangle";


} else if (isInFirstRectangle == false && isInSecondRectangle == false){

	println  "New Point is in neither of the two rectangles"; 

}

























