const students= [
    'tina',
    'meena',
    'duma',
    'machha'
];
//for loop
// for(let i= 0; i<students.length; i++){
//     console.log(`Roll no ${i + 1}: ${students[i]}`);
// }

//for in loop
for(let i in students){
    console.log(`Roll no ${i + 1}: ${students[i]}`);
}

//for of loop
for(let student of students){
    console.log(student);
}