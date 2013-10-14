class MyCalc {
	double x;
	double y;
	double doAdd(){return x + y}
	double doSubtract(){return x - y}
	double doMultiply(){return x * y}
	double doDivide(){return x / y}
}

MyCalc cCalc = new MyCalc()
print "Please key in a number: "
cCalc.x = Double.parseDouble(System.console().readLine())
print "Now please key in another number: "
cCalc.y = Double.parseDouble(System.console().readLine())

println "Please choose what operation you would like to perform with these numbers."
println "For ADDITION please type 1,"
println "For SUBTRACTION please type 2," 
println "For MULTIPLICATION please type 3," 
println "For DIVISION please type 4"
int choice = Integer.parseInt(System.console().readLine())

switch(choice){
	case 1:
		println "The Sum is: " + cCalc.doAdd()	
		break;
	case 2:
		println "The Answer is: " + cCalc.doSubtract()	
		break;	
	case 3:
		println "The Result is: " + cCalc.doMultiply()	
		break;
	case 4:
		println "The Answer is: " + cCalc.doDivide()	
		break;
}

