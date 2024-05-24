// Problem statement
// Design a JavaScript function named findDuplicate to identify and extract all duplicate elements from an array. The function should accept an array as a parameter and create a new array containing only the duplicate elements found in the input array. The resulting array should be returned.

// Expected Input
// [4,56,54,3,56,36,54]
// Expected Output
// [56,54]
// Test Cases
// Find all the duplicate element in the array
// Create a new array consisting of all the duplicate elements
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