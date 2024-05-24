// Problem statement
// You are tasked with creating a program to calculate the price of a pizza based on its size, quantity and selected toppings.



// Objectives
// The pricing is determined as follows:
// - The base price of the pizza depends on its size, which can be small, medium, or large.
// Small: $8.00
// Medium: $10.00
// Large: $12.00
// - Each topping selected for the pizza incurs an additional cost of $1.50 per topping.
// Write a JavaScript function pizzaPricing, that takes the size of the pizza as a parameter in form of string and returns a curried function.
// The curried function should take an array of selected toppings as a parameter and return another function. The final function should take the quantity of pizzas as a parameter, calculate the total price and return the total price.
// Implement the pizzaPricing function and ensure that the returned function correctly calculates the total price based on the given parameters. 
// Expected Input

// Pizza = Large;
// Toppings = bacon , cheese
// Expected Output

// 15

// Note:
// The final result should be up to 2 decimal places.

function pizzaPricing(size) {
    const basePrices = {
         small: 8.0,
         medium: 10.0,
         large: 12.0
       };
    const toppingPrice = 1.5;
    return function(toppings) {
    return function(quantity) { 
       const basePrice = basePrices[size];
       const toppingsCost = toppings.length * toppingPrice;
       const totalPrice = (basePrice + toppingsCost) * quantity;
       return totalPrice.toFixed(2);
     };
   };
 }
   
