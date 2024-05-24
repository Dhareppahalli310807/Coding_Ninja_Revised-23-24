// Problem statement
// You need to create a higher-order function that could be applied to an array of numbers to get the modified result.



// Requirements:

// Implement the customMap function without using any built-in higher-order functions. 
// The function should take in two parameters: array (an array of numbers) and callbackFn (a function that takes in a number and returns a modified number).
// The callbackFn should be applied to each element of the array.
// The customMap should return the updated array after passing each element through the callback function.
// The callbackFn could be anything, for e.g., square(a function that returns the square of the number passes to it), double(a function that returns the double of a number), etc.

// Input:
//       customMap([2,3,4],square);

// Output:
// [4,9,16]

function main() {
    const array = [2, 4, 6, 2, 7, 8];
   function customMap(array, callbackFn) {
        const result = [];
        for (let i = 0; i < array.length; i++) {
            result.push(callbackFn(array[i]));
        }
        return result;
    }

    return customMap;
}

  