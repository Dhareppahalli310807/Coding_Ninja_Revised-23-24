// Problem statement
// Develop a JavaScript function called commonDigits that accepts two positive integers, num1, and num2, as parameters. The function should determine whether the numbers have an equal number of digits or not. If they have an equal number of digits then store true in the answer else store false.

// Note

// Use Math.floor when dividing the number by 10 to ensure that it returns data type number.
// Expected Input
// num1 = 78574
// num2 = 78392
// Expected Output
// true
// Expected Input
// num1 = 74847
// num2 = 781
// Expected Output
// false
// Test Cases
// Make a function named commonDigits
// Take two numbers as arguments
// Count the number of digits in both the numbers
// Check if both the numbers have equal numbers of digits
// If they are equal return true else return false

function commonDigits(num1, num2) {
    // counting for num1
    
    let num1Digits = 0;
    let tempNum1 = num1;
    while (tempNum1 !== 0) {
        tempNum1 = Math.floor(tempNum1 / 10);
        num1Digits++;
    }

    // counting for num2
    
    let num2Digits = 0;
    let tempNum2 = num2;
    while (tempNum2 !== 0) {
        tempNum2 = Math.floor(tempNum2 / 10);
        num2Digits++;
    }

    //checking both number is equal or not
    
    return num1Digits === num2Digits;
}

commonDigits(78574, 78392);
commonDigits(74847, 781);