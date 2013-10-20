println "Key in a mathematical operation please: "
String str = System.console().readLine()
int operPosi = 0
char operation

for(int i = 0;i < str.length(); i++){
	if(str.charAt(i) == '+'){
			operPosi = i
			operation = '+'
			break;
	} else if(str.charAt(i) == '-'){
			operPosi = i
			operation = '-'
			break;
	} else if(str.charAt(i) == '*'){
			operPosi = i
			operation = '*'
			break;
	} else if(str.charAt(i) == '/'){
			operPosi = i
			operation = '/'
			break;
	} 
}

double x = Double.parseDouble(str.substr(0,operPosi))
double y =  Double.parseDouble(str.substr(operPosi + 1,str.length()))

if(operation == '+'){
	println "The result of this operation is: " + (x + y)
} else if(operation == '-'){
	println "The result of this operation is: " + (x - y)
} else if(operation == '*'){
	println "The result of this operation is: " + (x * y)
} else if(operation == '/'){
	println "The result of this operation is: " + (x / y)
}