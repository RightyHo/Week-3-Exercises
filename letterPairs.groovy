println "Please key in some text: "
String searchStr = System.console().readLine()
println "Now key in a larger text message: "
String totStr = System.console().readLine()
int numAppear = 0

int searchLen = searchStr.length()
char firstChar = searchStr.substring(0,1)

for(i = 0; i < totStr.length() - searchLen; i++){
	if(totStr.charAt(i) == firstChar){						//should be able to remove this line
		for(z = 0; z < searchLen; z++){
			if(totStr.charAt(i + z) == searchStr.charAt(z)){
				numAppear++									//this is where the problem is...increasing to much 
			}
		}
	}
}

println "There were " + numAppear + " instances of your search string in the longer text"
println searchStr