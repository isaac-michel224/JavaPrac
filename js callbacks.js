function calculator(operation, x, y) {
    return operation(x, y);
}

function add(a, b) {
    return a + b;
}

function multiply(a, b) {
    return a * b;
}

/*let result = calculator(add, 2, 3);
console.log(result);*/

/* let result = calculator(add, 3, 12);
console.log(result);*/


let result = calculator(add, add(1, 2), multiply(3, 4));
console.log(result);

let num1 = add(1, 2);
let num2 = multiply(23, 4);
add(2, 4);

console.log("Num 1: " + num1);
console.log("Num 2: " + num2);

//Old Version - Without Callbacks
/*
function myDisplayer(some) {
    document.getElementById("demo").innerHTML = some;
}

function myCalculator(input1, input2) {
    let sum = input1 + input2;
    return sum;
}

let result = myCalculator(5, 5);
myDisplayer(result);
*/



function myDisplayer(some) {
    document.getElementById("demo").innerHTML = some;
  }
  
  function myCalculator(input1, input2, myCallback) {
    let sum = input1 + input2;
    myCallback(sum);
  }
  
  myCalculator(4, 5, myDisplayer);
  myCalculator(7, 5, console.log);

  let numbers = [6, 7, 1, 2, 3, 4, 5];
  numbers.sort((a, b) =>  a - b);
  console.log(numbers);

  console.log("Starting timer!")

  setTimeout(function afterTwoSeconds ()
  {console.log("Two seconds have passed!");}, 2000);

  console.log("This happens after the timeout function!");

  setInterval(timestamp, 1000);
  let time = document.getElementById("time");

  function timestamp() {
      let d = new Date();
      time.innerHTML = d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds}
  
function carDisplayer(some) {
    document.getElementById("carZone").innerHTML = some;
}

function getFile(myCallback) {
    let req = new XMLHttpRequest();
    req.open('GET', "mycar.html");
    req.onload = function() {
        if (req.status == 200) {
            myCallback(this.responseText);
        } else {
            myCallback("Error: " + req.status);
        }
    }
    req.sand();

}

getFile(carDisplayer);

function ajaxCall() {
    let ajaxRequest = new XMLHttpRequest();
    
    ajaxRequest.onreadystatechange == function () {
        if (ajaxRequest.readyState == XMLHttpRequest.DONE) {
            if (ajaxRequest.status == 200) {
                let myDiv = document.getElementById("requestDiv");
                let newDiv = document.createElement("div");
                newDiv.innerHTML = ajaxRequest.responseText;
                myDiv.appendChild(newDiv);
            
            } else if (ajaxRequest.status == 400) {
                console.log("There was an error 400");
            } else {
                console.log("There was an error, code: " + ajaxRequest.status)
            }
        }
    };
    ajaxRequest.open("GET", "https://jsonplaceholder.typicode.com/todos/1")
    ajaxRequest.send();
}

function clearMain() {
    document.getElementById("requestDiv").innerHTML = "";
}

/*var form = document.querySelector('form')
form.onsubmit = function (submitEvent) {
  var name = document.querySelector('input').value
  request({
    uri: "http://example.com/upload",
    body: name,
    method: "POST"
  }, function (err, response, body) {
    var statusMessage = document.querySelector('.status')
    if (err) return statusMessage.value = err
    statusMessage.value = body
  })
}*/

var formUploader = require('formuploader');
document.querySelector('form').onsubmit = formUploader.submit

let userInput = prompt("Enter a number:");

y = 1 / userInput;
console.log(y);




