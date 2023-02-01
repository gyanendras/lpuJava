/**
 * 
 */
// alert("hello World-1");
console.log("Trying JavaScript-2");
var x = "Delhi";
x = 1;
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
// return true only when there is no error above it.
return false;

}

function eventProcessing(){
	var city = document.getElementsByName("city")[0].value;
    console.log(city);
	console.log("i am moving mouse"+ ++x);
	if(city=="Remote"){
		document.getElementById("remoteMsg").innerHTML="Work From Anywhere in India!!";
		ylabel=document.createElement("label");
		ylabel.innerHTML = "create label to append";
		y[0].appendChild(ylabel);
		
	}
}



//console.log(y);
