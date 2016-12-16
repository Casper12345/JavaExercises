// creating class 
class Point {
	double x;
	double y;
	
}


class Rectangle { 
  Point upLeft; 
  Point downRight;

}

upLeft = new Point(); 

upLeft.x = 1;
upLeft.y = 2; 



downRight = new Point(); 

downRight.x = 3;
downRight.y = 4; 



myRectangle = new Rectangle();

myRectangle.upLeft = upLeft;

myRectangle.downRight = downRight; 


println myRectangle.upLeft.y;