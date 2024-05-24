//global scope 
//function(local) scope
//block scope
// if we used variable inside the block its call block
var varNum = 10;// local scope
let letNum = 20;
const constNum = 30;

function print(){ // functional scope
    var varLocal = 10;
    let letLocal = 20;
    const constLocal = 30;
    console.log(varLocal, letLocal, constLocal);
    console.log(varNum, letNum, constNum);

}
console.log(varNum, letNum, constNum);

print();

console.log(varLocal, letLocal, constLocal);

