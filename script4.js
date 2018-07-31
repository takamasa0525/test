document.write("問１"+"<br>");
function menseki(hankei1,hankei2,ensyu){
	return"面積は"+hankei1*hankei2*ensyu+"c㎡です。"
}
document.write(menseki(5,5,3.14));
document.write("<br>");
document.write(menseki(7,7,3.14));
document.write("<br>");
document.write(menseki(10,10,3.14));

document.write("<br>"+"問2"+"<br>");
function totalprice(adultkazu,childkazu){
	return adultkazu*500+childkazu*200+"円です。"
}
document.write(totalprice(2,4));
document.write("<br>");
document.write(totalprice(1,5));
document.write("<br>");
document.write(totalprice(3,7));
document.write("<br>");
