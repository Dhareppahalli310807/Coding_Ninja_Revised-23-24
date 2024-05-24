//multiple callback is looks like pyramid door also it is called callback hell
function print(){
    setTimeout(()=>{
        console.log("welcome");
        setTimeout(()=>{
            console.log("to");
            setTimeout(()=>{
                console.log("the");
                setTimeout(()=>{
                    console.log("joyland");
                },1000);
            },1000);
        },1000);
    },1000);
}

print();


//promises

//promises are the foundation of async programming in modern javascript, 
//A promises in an object returned by an async function ,
// which represent the current state of operation


//resolve operation how to handle
const req = new Promise((resolve, reject) =>{
    setTimeout(()=>{
        //console.log("promise initiated");
        resolve({firstName: "dhareppa", lastName: "halli"});
    }, 1000);
});

req.then((value)=>{
    console.log(value);
});

//reject operation how to handle

const req1 = new Promise((resolve, reject) =>{
    setTimeout(()=>{
        reject("Request has been rejected");
    }, 1000);
});

req1.then((value)=>{
    console.log(value);
}).catch((err)=>{
//able too get the handled error, without catch we will get the browser error
    console.log(err);
}).finally(()=>{
    //finally if not resolve and not rejected
    console.log("finally request completed");
});
