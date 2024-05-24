//1. assignment operator
let a= 10;
let b= a;
let c = a = 20;

console.log(a); //20
console.log(b); //10
console.log(c); //20

//2. arithmatic operator
console.log(10+2);
console.log(10-2);
console.log(10*2);
console.log(10/2);

//3. more arithmatic operator
let m= 10;
m= m+1;
m++; //increased by 1 only
console.log(m); //11

//4. augmented assignment operator
let i= i+3;
i +=3;

//5. comparison operator == quality check, !=, < , > ,<=, >=, ===, !==
let p= 2;
let q= 4;
console.log(p==q);
console.log(p!=q);
console.log(p<=q);
console.log(p>=q);
console.log(p<q);
console.log(p>q);
console.log(p===q); // its check data along with datatype

//6. logical operator- and, or, not

// true && true= true
// true && false= false
// false && false= false
// false && true= false

// true || true= true
// true || false= true
// false || false= false
// false || true= true

//7. precedence operator
let m1= 10;
let m2= 20;
let m3= 30;
let avg= (m1 + m2 + m3) / 3;

//8. type coercion
console.log( 5 + 5); // 10
let num= '5' + 5; // 55
console.log(num); //string
let sub = '55' - 10; // 45
console.log('4' * 2); // 8

//9. type conversion
// string
console.log(String(100)); // 100
console.log(String(true)); // true
console.log(String(null)); // null
console.log(String(undefined)); // undefined

// to string
console.log((100).toString()); //100
console.log((null).toString()); //error


// convert to number
console.log(Number('100')); // 100
console.log(Number("value")); // NaN
console.log(Number(true)); // 1
console.log(Number(false)); // 0

// unary + operator
let g= '111';
console.log(+g);// 111
let j= '23cf'
console.log(+j); //NaN

//parseInt
console.log(parseInt('123r')); //123
console.log(parseInt('f123r')); // NaN
console.log(parseInt('12.3r')); // 12

//parsefloat
console.log(parseFloat('12.3r')); // 12.3

//ternary operator
let num1 = 10;
let num2 = 19;
let greater;
if(num1 > num2? num1: num2); // ternary operator
// if(num1 > num2){
//     greater = num1;
// }else{
//     greater = num2;
// }
console.log("greate num is " + greater);



