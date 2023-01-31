/**
 * 
 */
// alert("hello World-1");
console.log("Trying JavaScript-2");
var x = "Delhi";
x = 123;
// x = new Date();
console.log(x);
document.write("<h1>JavaScritp heading</h1>");
strArr = ["red", "yellow", "Blue"];
for(var i =0; i<strArr.length; ++i){
	console.log(strArr[i]);
}

var y = document.getElementsByName("myform");
var y2 = document.getElementById("fn1");

function validate(){
var y3 = document.forms["myform"]["fname"].value;
var y4 = document.forms["myform"]["lname"].value;
console.log(y3);

if(y4.length==0) {
	console.log("put value of last name");
	// alert("Add value to Last name");
	document.getElementsByName("lnerror")[0].innerHTML = "Error:Add value to Last name";
	document.getElementsByName("lnerror")[0].style.border="solid red";
	document.getElementsByName("lnerror")[0].style.color="red";
}

return false;

}
//console.log(y);
