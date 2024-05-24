// the hierarchy of object where each object has a reference to its parent prototype

function Movie(title) {
    this.title = title;
}

const movie2 = new Movie(`avtar`);
movie2.year = 2023;
console.log(movie2);
console.log(movie2__proto__);


const movie3 = new Movie(`the avenger`);
console.log(movie3);
console.log(movie3__proto__.__proto__.__proto__); // null


const car = {
    name: `BMW`,
}

console.log(car.__proto__);