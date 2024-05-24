//its accept multiple parameter
//A technique to convert a function with multiple arguments into a sequence of function , each taking single arguments

// function add1(a,b,c){
//     return a + b + c;
// }
// console.log(add1(2,4,4));//10

// function add2(a){
//     return function(b){
//         return function(c){//closure
//             return a + b + c;
//         };
//     };
// }
// console.log(add2(2)(4)(4));//10

function power(b){
    return function(a){
        return a**b;
    }
}
const square = power(2);
console.log(square);
console.log(square(4));//16
console.log(square(7));//49