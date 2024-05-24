//js is a synchronous in nature and its single threaded
//synchromous - suppose i have set of operation or lines of code run after each privious operation done.

// console.log('before alert message');//first run 
// alert("blocking js");
// console.log('after alert message');//last run

// asynchronous- it will not wait to complete privious operation
//asyncronous js api
// setInterval();
// setTimeout();

const buttonElement = document.querySelector('.button');
const textElement = document.querySelector('#text');
buttonElement.addEventListener('click',()=>{
    textElement.textContent = 'Button is pressed';
    setTimeout(()=>{
        textElement.textContent = '';
    }, 2000);
} )
