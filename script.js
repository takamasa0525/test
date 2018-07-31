document.write("問１"+"<br>");
var i= 1;
while(i<=5){
	document.write("★");
	i++;
}

document.write("<br>"+"問２"+"<br>");
for(var i=1; i<=2; i++){
	document.write("★★★"+"<br>");}


document.write("<br>"+"問３"+"<br>");
for (var i=1; i<=5;i++){
	document.write("☆");
}
document.write("<br>");
for (var a=1; a<=5;a++){
	document.write("☆");
}



document.write("<br>"+"問４"+"<br>");
for(var star1=1; star1<=4; star1++){
	for (var star2=1; star2<=5; star2++){
		document.write("★");
	}
	document.write("<br>");
}


document.write("<br>"+"問５"+"<br>");
for(var star1=1; star1<=4; star1++){
    for(var star2=1; star2<=3; star2++){
	document.write("★");
}
    document.write("<br>");
}



document.write("<br>"+"問６"+"<br>");
for(var star1=1; star1<=3; star1++){
for(var star2=1; star2<=3; star2++){
	if(star2 % 2==0){
	document.write("☆");}
	else{
		document.write("★");}
}
	   document.write("<br>");}



document.write("<br>"+"問７"+"<br>");
for(var star1=1; star1<=5; star1++){
	for(var star2=1; star2<=5; star2++){
		if( star2 % 2==0){
			document.write("☆");}
		else{document.write("★");}
		}
	document.write("<br>");}
	


document.write("<br>"+"問8"+"<br>");

for(var a=0 ; a<6; a++){
for(var b=0; b<a; b++){
		document.write("★");}
	
	{document.write("<br>")
	}
}