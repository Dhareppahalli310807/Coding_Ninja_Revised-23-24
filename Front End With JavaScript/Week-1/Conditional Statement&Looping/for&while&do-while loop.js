//for loop

//print a massage 10 times
for(i= 1; i<=10; i++){
console.log("Dhareppa");
}

//while loop
let i = 1;
while(i<= 10){
    console.log(i);
    i++;
}

//do while loop
let randomNum = 8;
let guessedNum;
do{
    guessedNum = prompt("guess the num");
    if(guessedNum == randomNum){
        console.log("guessed currectly");
    }else{
        console.log("guess another one");
    }
}while(guessedNum != randomNum);

//nested loop

// let num= 4;
for(let num= 2; num<=10; num++){
    for(let i= 1; i<=10; i++){
        console.log('${num} * ${i} = ${num * i}');
    }

}
