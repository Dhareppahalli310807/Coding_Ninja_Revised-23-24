//dynamic array
const cities = [
    'mumbai',
    'pune',
    'dhili',
]

console.log(cities.length);
cities[2] = 'bengalore';
console.log(cities);

//1. adding an element
//push() push at last
const teams = ['csk','rcb','kkr','mi'];
teams.push('gt');
console.log(teams);

//unshift add at first
teams.unshift('dh');
console.log(teams);

//2. removing an element
//pop remove from last
teams.pop();
console.log(teams);

//shift remove from first
teams.shift();
console.log();

//3. check the element is present or not
//indexOf() check is there or not
const rcbIndex = teams.indexOf('rcb');
console.log(rcbIndex);

//includes()
const rcbIndex1 = teams.includes('rcb');
console.log(rcbIndex1);

//slice and splice
console.log(teams.slice(2)); //its remove from first 2 element
console.log(teams.slice(-2)); // its remove all elements expect slice one

//splice
teams.splice(2,0,'lsg'); // index, no of delete, add insert


//concat combine two array
const teams2 = ['india', 'england', 'pak'];
const mergedTeams = teams.concat(teams2);
console.log(mergedTeams);
