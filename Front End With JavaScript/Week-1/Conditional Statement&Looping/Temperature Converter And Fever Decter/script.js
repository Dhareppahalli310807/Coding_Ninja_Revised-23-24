//Write the program to convert tempF to into celcius and also to detect fever.
//Assign the final answer in result variable.
//Do not alter anything else given in the starter code

function main(tempF) {
  let result;
    let tempC = (tempF - 32) * (5/9); // convert temp from Fah to cel
    
    if (tempC >= 37) { // first condition
        let result = "You have got a fever. Your temperature is " + tempC.toFixed(1) + "°C.";
        return result;
    } else { // 2nd condition
        let result = "You don't have a fever. Your temperature is " + tempC.toFixed(1) + "°C.";
        return result;
    }
  return result;
}
