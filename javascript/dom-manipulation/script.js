////////////
/// var ///
//////////

// varType = "Hello World";
// var varType;
// console.log(varType);
// var varType;

// function getVar() {
//     varType = "Hello World";
//     return varType;
// }
// console.log(getVar());

////////////
/// let ///
//////////

// function getLet() {
//     let letType = "JavaScript is !Fun";
//     letType = "sample";
//     // console.log(letType);

//     return letType;
// }
// console.log(getLet());


//////////////
/// const ///
////////////

// const name = "Don";

// function getName() {
//     const name = "Don";
//     return name;
// }
// console.log(name);

// varType = "JavaScript is !fun";
// var varType;
// console.log(varType);

// getElementById
// const getFirstElement = document.getElementById("first-list");
// console.log(getFirstElement.className);

// getElementsByClassName
// const getElements = document.getElementsByClassName("item-list");
// console.log(getElements[3].innerHTML)

// getElementsByTagName
// const getElement = document.getElementsByTagName('li');
// console.log(getElement)(

// querySelector && querySelectorAll
// const selector = document.querySelector("li, .item-list");
// const selectorAll = document.querySelectorAll("li");

// console.log("querySelector => ", selector.textContent);
// // console.log("querySelector => ", selectorAll);

// selectorAll.forEach(element => {
//     console.log("querySelector => ", element.innerText);
// })

// const selectorOfList = document.querySelector("li:last-child");
// console.log("querySelector => ", selectorOfList.textContent);
// selectorOfList.innerHTML = "JavaScript is !fun";

// getAttribute
// const selectorOfList = document.querySelector("li:last-child");
// console.log("After => ", selectorOfList.getAttribute("id"));
// selectorOfList.setAttribute("id", "last-child");
// console.log("After => ", selectorOfList.getAttribute("id"));
// selectorOfList.removeAttribute("id");
// console.log("After remove => ", selectorOfList.getAttribute("id"));
// selectorOfList.style.listStyle = "number";

// const selectorOfList = document.querySelectorAll("li");
// selectorOfList.forEach((element, index) => {
//     element.addEventListener("click", () => onClickChangeBackground(index));
// });

// function onClickChangeBackground(index) {
//     selectorOfList[index].classList.toggle("list-bg");
// }