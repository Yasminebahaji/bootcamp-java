const arr = [];
const randomChars = ['🍐','🍑','🍒','🍅','🥭','🥥','🥝','🏺','🥬','🌰','🥕','🧅']; //12

const root = document.getElementById("root");
arr.push(randomChar());
root.innerText = arr;

function randomChar(){
  return randomChars[Math.floor(Math.random() * randomChars.length)];
}


