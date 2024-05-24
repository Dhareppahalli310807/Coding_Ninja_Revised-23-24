//callback function

function greet(callback){
    setTimeout(()=>{
        console.log("hello.");
        callback(); //callback function
    }, 1000);
}
function message(){
    console.log("By");
}

greet(message);
//message();


// without callback output is 
// BY
// hello

//with callback function
//hello
//By