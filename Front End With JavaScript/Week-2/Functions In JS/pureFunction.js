// Problem statement
// In the given code removeVowels is an impure function that is used to remove all the vowels from the value property of obj.

// But the removeVowels modify the original object and you don't want that.

// Refactor the code to make it a pure function so that instead of modifying the original object, it returns a new Object with a modified value.

//Refactor the given impure function to pure function.
function removeVowels(obj) {
    const newValue = obj.value.replace(/[aeiou]/gi, "");
    return { value: newValue };}
  
  let strObj = { value: "Hello World" };
  // For pure function
  // newObj = removeVowels(strObj);
  removeVowels(strObj);
  console.log(strObj.value);