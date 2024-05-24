const today = new Date();
console.log(today);

const birthDate = new Date("1999-06-01");
console.log(birthDate);
console.log(birthDate.getFullYear());//1999
console.log(typeof birthDate.getFullYear());

const someday = new Date(1970, 1);
console.log(someday);