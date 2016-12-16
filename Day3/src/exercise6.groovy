// creating classes 


class Point {
	double x;
	double y;
	
}


class Rectangle { 
  Point upLeft; 
  Point downRight;
	
}
	

// first instance of Point


println "Define the rectangle";

upLeft = new Point();

print "Up Left point (x): "
upLeft.x = Double.parseDouble(System.console().readLine()); 

print "Up Left point (y): "
upLeft.y = Double.parseDouble(System.console().readLine()); 


// second instance of Point


downRight = new Point();

print "Down right point (x): "
downRight.x = Double.parseDouble(System.console().readLine()); 

print "Down right point (y): "
downRight.y = Double.parseDouble(System.console().readLine()); 


//upRight = new Point();
//downLeft = new Point();


// create instance of rectangle points


myRectangle = new Rectangle(); 

myRectangle.upLeft = upLeft;

myRectangle.downRight = downRight; 


// create third point


thirdPoint = new Point();

print "New Point (x): "
thirdPoint.x = Double.parseDouble(System.console().readLine()); 

print "New Point (y): "
thirdPoint.y = Double.parseDouble(System.console().readLine()); 


// calculate if new point is in the rectangle


if(thirdPoint.x >= myRectangle.upLeft.x &&
   thirdPoint.x <= myRectangle.downRight.x &&
   thirdPoint.y >= myRectangle.downRight.y &&
   thirdPoint.y <=  myRectangle.upLeft.y){
   
	
	println "New Point is within the rectangle";

} else {

	println "New Point is not within the rectangle";

}











