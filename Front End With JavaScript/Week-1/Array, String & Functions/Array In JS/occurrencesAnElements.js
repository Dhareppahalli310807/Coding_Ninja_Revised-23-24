// Problem statement
// You have been provided with an array your task is to find all the duplicate elements and return them in form of an array

// Expected Input
//  [12,43,64,45,35,12,68,12]
// Expected Output
// [12]
// Test Cases
// Find the element that has more than one occurrence
// Store the new elements in a new array
// Return the new array

//Complete the findDuplicate function
// Do not alter the starter code.

let arr = [4, 2, 34, 4, 1, 12, 1, 4];
function findDuplicate(arr){
    
	const counts = {};
    const duplicates = [];

    for (const num of arr) {
        counts[num] = counts[num] ? counts[num] + 1 : 1;
    }
    for (const num in counts) {
        if (counts[num] > 1) {
            duplicates.push(parseInt(num));
        }
    }

    return duplicates;
}    
console.log(findDuplicate(arr));