//using json
const quesJSON = [

{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
{
    correctAnswer : 'Three',
    options: ['Two', 'Three', 'Four', 'Five'],
    questions:"How many pieces of bun are in a Mcdonald`s Big Mac?"

},
];

//declare initial score
let score = 0;
let currentQuestion = 0;
const totalScore = quesJSON.length;

//accessing all the elements
const questionsElements = document.getElementById(
    'questions'
    );

const optionsElements = document.getElementById(
    'options'
    );

const scoreElements = document.getElementById(
    'score'
    );

const nextElements = document.getElementById(
    `next`
    );

//call the function
showQuestion();

nextElements.addEventListener("click", ()=>{
    scoreElements.textContent = `score: ${score} / ${totalScore}`;
    nextQuestion();
})

function showQuestion(){
    //destructing the object
    const {correctAnswer, options, questions,} = quesJSON[currentQuestion];

    //setting questions text content
    questionsElements.textContent = questions;

    //shuffle defination
    const shuffledOptions = shufflOptions(options);

    //populationg the options div with button
    shuffledOptions.forEach((opt) => {
    //creating the button and appending it to the options div
    const btn = document.createElement('button');
    btn.textContent = opt;
    optionsElements.appendChild(btn);

    //event handler on the button
    btn.addEventListener("click",() =>{
        if(opt === correctAnswer){
            score++;
        }else{
            score = score - 0.25;
        }
        scoreElements.textContent = `score: ${score}`;
        nextQuestion();
    });
});
}

//function for nextQuestion
function nextQuestion(){
    currentQuestion++;
    if(currentQuestion >= quesJSON.length){
        questionsElements.textContent = "Quiz Completed!!";
        optionsElements.textContent = "";
    }else{
        optionsElements.textContent = "";
        showQuestion();
    }
}

//shuffling the options
function shufflOptions(options){
    for(let i = options.length - 1; i>=0; i--){
        const j = Math.floor(Math.random() *i + 1);
        [options[i], options[j]] = [options[j], options[i]];
    }
    return options;
}
