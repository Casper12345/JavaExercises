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



// create instances

myRectangle = new Rectangle(); 

myRectangle.upLeft = upLeft;

myRectangle.downRight = downRight; 



// calculate width


double width = myRectangle.downRight.x - myRectangle.upLeft.x 


// calculate height


double height = myRectangle.upLeft.y - myRectangle.downRight.y


// calculate perimeter 


double perimeter = 2*(width + height)


// calculate area


double area = width * height;


// output

println "The perimeter is: "  + perimeter;
println "The area is: " + area;




