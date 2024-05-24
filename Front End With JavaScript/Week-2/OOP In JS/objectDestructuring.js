const obj = {
    a:1,
    b:2,
    c:[`O`,`B`,`J`],
    d:{value:`val`},
};

//binding pattern

// const{a,b,c,d} = obj;//const a = obj.a
// console.log(a);
// console.log(c);

//
const {a:a1}= obj;
console.log(a1);//1
console.log(a);//a is not defined

//assignment pattern
let b;
({b:b}= obj);
console.log(b);//2