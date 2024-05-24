const heading = document.querySelectorAll(".second");
console.log(heading);//null
const para = document.querySelector("#para");
console.log(para);//null

console.log(document.getElementById("para"));
console.log(document.getElementsByClassName("first"));

heading.style.color = 'red';