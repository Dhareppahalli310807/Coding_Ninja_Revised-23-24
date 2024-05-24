//declaration of Function

function sum(a, b){
    return a + b;
}

const sum1 = sum(5,6);
console.log(sum1);// 11
//function expression

const sum2 = function(a, b){
    return a + b;
}

console.log(sum2);// f(a, b){return a +b;}
console.log(sum2(1, 8));// 9