//1. using ES6 module just use exports in front of function
export function sum(a, b){
    return a + b;
}

// private function
export function div(a, b){
    return a/b;
}

console.log("Loading this file");

//basically two ways to create module
//1. Common JS module
//2. ES6 module