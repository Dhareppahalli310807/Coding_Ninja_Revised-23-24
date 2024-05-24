var userName = "tom";
var userAge = 10;
console.log(`userName: ${userName}`);
console.log(`userAge: ${userAge}`);

function greetUser(name){
    var greet = "I hope you are doing fine";
    console.log(`hello ${name}, ${greet}`);
    var currentYear = 2024;
    const year = currentYear - userAge;
    return `your birthYear is ${year}`;
}
var birthYear = greetUser(userName);
console.log(birthYear);
