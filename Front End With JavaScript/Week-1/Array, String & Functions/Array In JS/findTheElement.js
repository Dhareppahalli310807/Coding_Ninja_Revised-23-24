// Problem statement
// You have been given an array and a number. Your task is to find the number in the array and return the index of that number. If the element is not present in the array return -1.

// Note
// No duplicate elements are present in the array
// Expected Input
// arr=[23,43,67,89,62,29]
// ele= 67
// Expected Output
// 2
// Expected Input
// arr=[23,43,67,89,62,29]
// ele= 82
// Expected Output
// -1
// Test Cases
// Traverse through the array and find the element
// If the element is present in the arr return the index of the element else return -1.

function findTheNumber(arr,ele) {
    let answer = -1;
 	for (let i = 0; i < arr.length; i++) {
        if (arr[i] === ele) {
            answer = i;
            break;
        }
    }
    return answer;
}