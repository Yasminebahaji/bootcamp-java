const arr = [];
const randomChars = ['🍐', '🍑', '🍒', '🍅', '🥭', '🥥', '🥝', '🏺', '🥬', '🌰', '🥕', '🧅']; //12
//! Node HTML (Elements) and Events
const root = document.getElementById("root");

const pushBtn = document.getElementById("pushBtn");
pushBtn.addEventListener("click", pushElement);

const unshiftBtn = document.getElementById("unshiftBtn");
unshiftBtn.addEventListener("click", unshiftElement);

const insertAtBtn = document.getElementById("insertAtBtn");
insertAtBtn.addEventListener("click", insertAtElement);

const popBtn = document.getElementById("popBtn");
popBtn.addEventListener("click", popElement);

const shiftBtn = document.getElementById("shiftBtn");
shiftBtn.addEventListener("click", shiftElement);

const removeAtBtn = document.getElementById("removeAtBtn");
removeAtBtn.addEventListener("click", removeAtElement);

//! RandomChar
function randomChar() {
  return randomChars[Math.floor(Math.random() * randomChars.length)];
}

//! Adding Elements
function pushElement() {
  arr.push(randomChar()); // introduce en el final del array un icono aleatorio
  root.innerText = arr;
}

function unshiftElement() {
  arr.unshift(randomChar());
  root.innerText = arr;
}

function insertAtElement() {
  const addPositionInput = document.getElementById("addPositionInput");
  arr.splice(addPositionInput.value, 0, randomChar());
  root.innerText = arr;
}

//! Removing Elements
function popElement() {
  arr.pop();
  root.innerText = arr;
}

function shiftElement() {
  arr.shift();
  root.innerText = arr;
}
function removeAtElement() {
  const removePositionInput = document.getElementById("removePositionInput");
  arr.splice(removePositionInput.value, removePositionInput.value);
  root.innerText = arr;
}
/*

console.log(Math.random()); // num del 0 al 1
console.log(Math.random() * randomChars.length); // num del 0 a la longitud del array
console.log(Math.floor(Math.random() * randomChars.length)); // hacemos que el numero sea un entero y no un decimal
console.log(randomChars[5]); //🥥
console.log(randomChars[Math.floor(Math.random() * randomChars.length)]); //me devuelve un icono aleatorio
*/
