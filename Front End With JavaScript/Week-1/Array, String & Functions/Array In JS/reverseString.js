// Problem statement
// You have been given a string your task is to reverse and return the updated string
// Note
// Make the changes in the existing string you should not create a new string for storing the reverse of the string
// Expected Input
// "Hello"
// Expected Output
// "olleH"
// Test Cases
// Find the reverse of the given string 
// Return the updated string

//complete the reverseString Function.
//Do not alter the starter Code.

//complete the reverseString Function.
//Do not alter the starter Code.

function reverseString(str){
	const strArray = str.split("");
    strArray.reverse();
    str = strArray.join("");
    return str;
    }
    console.log(reverseString("Hello"));
    //Output : "olleH"