class YourChange {
	double cost;
	double amountPaid;
	int num50notes;
	int num20notes;
	int num10notes;
	int num5notes;
	int coins200p;
	int coins100p;
	int coins50p;
	int coins20p;
	int coins10p;
	int coins5p;
	int coins2p;
	int coins1p;
	double remainder;
	double difference(){amountPaid - cost}
}

YourChange cChange = new YourChange()
print "Please enter the total cost of your purchase: "
cChange.cost = Double.parseDouble(System.console().readLine())
print "Please enter the amount of money you paid to buy it: "
cChange.amountPaid = Double.parseDouble(System.console().readLine())

cChange.remainder =  cChange.difference()
println "Your change is " + cChange.remainder + " pounds"
println "This change will be returned to you in the following denominations:"

if(cChange.remainder >= 50.0){
	cChange.num50notes = Math.floor(cChange.remainder / 50.0)
	cChange.remainder = cChange.remainder - (cChange.num50notes * 50)
	println cChange.num50notes + " X 50 pound note(s)"
}
if(cChange.remainder >= 20.0){
	cChange.num20notes = Math.floor(cChange.remainder / 20.0)
	cChange.remainder = cChange.remainder - (cChange.num20notes * 20)
	println cChange.num20notes + " X 20 pound note(s)"
}
if(cChange.remainder >= 10.0){
	cChange.num10notes = Math.floor(cChange.remainder / 10.0)
	cChange.remainder = cChange.remainder - (cChange.num10notes * 10)
	println cChange.num10notes + " X 10 pound note(s)"
}
if(cChange.remainder >= 5.0){
	cChange.num5notes = Math.floor(cChange.remainder / 5.0)
	cChange.remainder = cChange.remainder - (cChange.num5notes * 5)
	println cChange.num5notes + " X 5 pound note(s)"
}
if(cChange.remainder >= 2.0){
	cChange.coins200p = Math.floor(cChange.remainder / 2.0)
	cChange.remainder = cChange.remainder - (cChange.coins200p * 2)
	println cChange.coins200p + " X 2 pound coin(s)"
}
if(cChange.remainder >= 1.0){
	cChange.coins100p = Math.floor(cChange.remainder / 1.0)
	cChange.remainder = cChange.remainder - (cChange.coins100p * 1)
	println cChange.coins100p + " X 1 pound coin(s)"
}
if(cChange.remainder >= 0.50){
	cChange.coins50p = Math.floor(cChange.remainder / 0.50)
	cChange.remainder = cChange.remainder - (cChange.coins50p * 0.50)
	println cChange.coins50p + " X 50 pence coin(s)"
}
if(cChange.remainder >= 0.20){
	cChange.coins20p = Math.floor(cChange.remainder / 0.20)
	cChange.remainder = cChange.remainder - (cChange.coins20p * 0.20)
	println cChange.coins20p + " X 20 pence coin(s)"
}
if(cChange.remainder >= 0.10){
	cChange.coins10p = Math.floor(cChange.remainder / 0.10)
	cChange.remainder = cChange.remainder - (cChange.coins10p * 0.10)
	println cChange.coins10p + " X 10 pence coin(s)"
}
if(cChange.remainder >= 0.05){
	cChange.coins5p = Math.floor(cChange.remainder / 0.05)
	cChange.remainder = cChange.remainder - (cChange.coins5p * 0.05)
	println cChange.coins5p + " X 5 pence coin(s)"
}
if(cChange.remainder >= 0.02){
	cChange.coins2p = Math.floor(cChange.remainder / 0.02)
	cChange.remainder = cChange.remainder - (cChange.coins2p * 0.02)
	println cChange.coins2p + " X 2 pence coin(s)"
}
if(cChange.remainder >= 0.01){
	cChange.coins1p = Math.floor(cChange.remainder / 0.01)
	cChange.remainder = cChange.remainder - (cChange.coins1p * 0.01)
	println cChange.coins1p + " X 1 pence coin(s)"
}