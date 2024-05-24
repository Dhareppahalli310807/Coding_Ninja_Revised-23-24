const fruits = [
    `apple`,
    `mango`,
    `kiwi`,
    `banana`,
];
//binding pattern
const [a,m] = fruits;
console.log(a,m);//apple mango

const [b,,k] = fruits;
console.log(a,m);//apple kiwi


//assignment pattern
