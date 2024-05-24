let num = 5;
let isPrime = true;
for(let i = 2; i = num; i++){
    if(num % i == 0){
       isPrime = false;
       break;
    }
}
if(isPrime){
    console.log("prime");
}else{
    console.log("not prime");
}