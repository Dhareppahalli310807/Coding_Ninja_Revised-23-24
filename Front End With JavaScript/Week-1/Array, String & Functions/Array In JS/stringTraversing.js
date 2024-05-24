function countChars(str, ch){
    let count = 0;
    for(let i= 0; i< str.length; i++){
        if(str.charAt(i) === ch){
            count++;
        }
    }
}

let str = "javascript is a simple langauage";
let charToFind = 'a';
countChars(str, charToFind);
