var userName = "tom";
var userAge = 10;
console.log(`userName: ${userName}`);
console.log(`userAge: ${userAge}`);

greetUser(userName);

function greetUser(name){
    console.log("*******************************************");
    var greet = "I hope you are doing fine";
    console.log(`hello ${name}, ${greet}`);
    var currentYear = 2024;
    const year = currentYear - userAge;
    console.log("********************************************");
    return `your birthYear is ${year}`;
}

function birthYear(year, age){
    console.log("calculating the birthYear");
    return year - age;
}

var birthYear = greetUser(userName);
console.log(birthYear);