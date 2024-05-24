// prototype is a reference to another object that serves as a blueprint for properties and methods

function Movie(title) {
    this.title = title;
}

const movie2 = new Movie(`avtar`);
movie2.year = 2023;
console.log(movie2);
console.log(movie2__proto__);


const movie3 = new Movie(`the avenger`);
console.log(movie3);
console.log(movie3__proto__);
