function greet(message){
    return function (wishes){
        console.log(`${wishes}, ${message}`);
    }
}