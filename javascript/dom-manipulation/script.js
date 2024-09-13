varType = 12;
var varType;
// var varType;

var greeter = "hey hi";
var times = 4;

if (times > 3) {
    var greeter = "say Hello instead"; 
}

console.log(greeter) // "say Hello instead"

const constType = "Let's learn JavaScript";
// constType = "This is re-assignemnt of the const declared variable!";

if (varType > 1) {
    let letType = "JavaScript is !fun";
    // letType = "This is new value!"
    console.log(constType);
} else {
    console.log(varType);
}
console.log(varType);

console.log("JavaScript is !Fun");

const targetById = document.getElementById('first-list');
const targetByCls = document.getElementsByClassName('item-list');
for (let index = 0; index < targetByCls.length; index++) {
    let element = targetByCls[index];
    console.log(element.textContent);
}
const targetByTag = document.getElementsByTagName('li');
const querySel = document.querySelector('li, .item-list');
const querySelAll = document.querySelectorAll('li:nth-child(4)');
querySelAll.forEach(elementTxt => {
    console.log(elementTxt.innerHTML); 
});

const listTag1 = document.getElementsByTagName('li');
console.log(listTag1[0].getAttribute('id'));
listTag1[0].setAttribute('id', 'changed-id-value')
console.log(listTag1[0].getAttribute('id'));

const listTag = document.getElementsByTagName('li');
console.log("Before", listTag[0].getAttributeNames());
listTag[0].removeAttribute('id')
console.log("After", listTag[0].getAttributeNames());

const h2Element = document.getElementsByTagName('h2');