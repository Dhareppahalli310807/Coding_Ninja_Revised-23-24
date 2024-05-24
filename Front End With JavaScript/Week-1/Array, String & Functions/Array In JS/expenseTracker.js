// Problem statement
// You're building a basic expense tracker program. The idea is to add new expenses, provided as a number, to the existing array of expenses. After doing this, the program should give you the updated array.

// Expected Input
// [340 , 567 , 434 , 653]
// newExpense = 543
// Expected Output
//  [340 , 567 , 434 , 653 , 543]
// Test Cases
//  You should add a new expense to the existing array

function addExpense(newExpense , originalExpenseArray) {
    originalExpenseArray.push(newExpense);
    return originalExpenseArray;
    
}