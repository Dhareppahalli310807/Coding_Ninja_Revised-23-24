const textElement = document.querySelector('#text');

let second = 0;
textElement.textContent = `${second}`;

const timer = setInterval(()=>{
    second++;
    textElement.textContent = `${second}`;
    if(second >= 5){
        clearInterval(timer);
    }

}, 1000)