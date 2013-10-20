class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

boolean isIn(Point pt, Rectangle rec){
	if(pt.x < rec.downRight.x && rec.upLeft.x < pt.x){
		if(pt.y < rec.upLeft.y && rec.downRight.y < pt.y){
			return true
		} else {
			return false
		}
	} else {
		return false
	}
}

Rectangle myRectA = new Rectangle()
myRectA.upLeft = new Point()
myRectA.downRight = new Point()

print "Please key in the x co-ordinate of the first corner of the 1st rectangle: "
double x1 = Integer.parseInt(System.console().readLine())
print "Please key in the y co-ordinate of the first corner of the 1st rectangle: "
double y1 = Integer.parseInt(System.console().readLine())
print "Please key in the x co-ordinate of the second corner of the 1st rectangle: "
double x2 = Integer.parseInt(System.console().readLine())
print "Please key in the y co-ordinate of the second corner of the 1st rectangle: "
double y2 = Integer.parseInt(System.console().readLine())

if(x1 > x2){
	myRectA.upLeft.x = x1
	myRectA.upleft.y = y1
	myRectA.downRight.x = x2
	myRectA.downRight.y = y2
} else {
	myRectA.upLeft.x = x2
	myRectA.upleft.y = y2
	myRectA.downRight.x = x1
	myRectA.downRight.y = y1
}

println "Now please enter the co-ordinates of a second rectangle"

Rectangle myRectB = new Rectangle()
myRectB.upLeft = new Point()
myRectB.downRight = new Point()

print "Please key in the x co-ordinate of the first corner of the 2nd rectangle: "
double xA = Integer.parseInt(System.console().readLine())
print "Please key in the y co-ordinate of the first corner of the 2nd rectangle: "
double yA = Integer.parseInt(System.console().readLine())
print "Please key in the x co-ordinate of the second corner of the 2nd rectangle: "
double xB = Integer.parseInt(System.console().readLine())
print "Please key in the y co-ordinate of the second corner of the 2nd rectangle: "
double yB = Integer.parseInt(System.console().readLine())

if(xA > xB){
	myRectB.upLeft.x = xA
	myRectB.upleft.y = yA
	myRectB.downRight.x = xB
	myRectB.downRight.y = yB
} else {
	myRectB.upLeft.x = xB
	myRectB.upleft.y = yB
	myRectB.downRight.x = xA
	myRectB.downRight.y = yA
}

Point inOrOut = new Point()

print "Please key in the x co-ordinate of a fifth point: "
inOrOut.x = Integer.parseInt(System.console().readLine())
print "Please key in the y co-ordinate of the fifth point: "
inOrOut.y = Integer.parseInt(System.console().readLine())

if(isIn(inOrOut,myRectA) && isIn(inOrOut,myRectB)){
		println "Your 5th point lies within both of your rectangles"
} else if(isIn(inOrOut,myRectA) || isIn(inOrOut,myRectB)){
		println "Your 5th point lies within only one of your rectangles"
} else {
		println "Your 5th point lies outside both of your rectangles"
}
