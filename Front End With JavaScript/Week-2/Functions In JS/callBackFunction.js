function greetUser(wish){
    console.log(`${wish()}`);
}

function sayHi(){
    return'hi';
}

function sayHello(){
    return 'hello';
}

greetUser(sayHi);
greetUser(sayHello);