const emojiDetails =[
    {
        description:'Smiling face with sunglasses',
        emoji:'HI',
    },
    {
        description:'Thumbs up',
        emoji:'BY',
    },
    {
        description:'Heart eyes',
        emoji:'HI',
    },
    {
        description:'Crying face',
        emoji:'BY',
    },
    {
        description:'Party popper',
        emoji:'HI',
    },
];

let currentEmojiIndex = 0;
let score = 0;
let second = 30;
let timer;

const guessInput = document.getElementById('guess-input');
const resultElement = document.getElementById('result');
const scoreElement = document.getElementById('score');
const timerElement = document.getElementById('timer');

function displayEmoji(){
    const descriptionElement = document.getElementById('description');
    descriptionElement.textContent = emojiDetails[currentEmojiIndex].emoji;
    timerElement.textContent = `Time: ${second}s`

}

function guessCheck(){
    const guess = guessInput.value.trim().toLowerCase();
    const currectEmoji = emojiDetails[currentEmojiIndex].description.trim().toLocaleLowerCase();


    if (guess === currectEmoji){
        resultElement.textContent = 'Correct';
        score++;
    }else{
        resultElement.textContent = 'Wrong';
    }

    scoreElement.textContent = `Score: ${score}`;
    guessInput.value = '';
    guessInput.focus();
    nextEmoji();
}

function nextEmoji(){
    currentEmojiIndex++;

    // setTimeout(() =>{
    //     resultElement.textContent = '';
    // }, 1000);

    if(currentEmojiIndex === emojiDetails.length){
        currentEmojiIndex = 0;
       
    }
    displayEmoji();
}


document.getElementById('guess-input').addEventListener('keydown', (Event) =>{
    if(Event.key === 'Enter'){
        guessCheck();
    }
});

document.addEventListener('DOMContentLoaded', () =>{
    displayEmoji();
    startTimer();
});


//setting timer

function startTimer(){
    timer = setInterval(() =>{
        second--;
        timerElement.textContent = `Time: ${second}s`;
        if(second <= 0){
            gameEnd();
        }
    }, 1000);
};

function gameEnd(){
    clearInterval(timer);
    guessInput.disabled = true;
    timerElement.textContent = "";
}