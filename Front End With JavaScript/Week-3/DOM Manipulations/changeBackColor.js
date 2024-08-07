// Problem statement
// For the given HTML Page, create a function using JavaScript with the name changebackground color.

// Objective:

// The function should be able to take a selector as input and should be able to change the background color to yellow.

// Note:
// 1. The selector can be anything, including class, ID, or tags.
// 2. For a particular selector, if more than one element is present, change the color of each element.
// 3. For eg: If more than one element has "myclass" as a class name change the background color of each element.

function changeBackgroundColor(selector){
	const elements = document.querySelectorAll(selector);
    elements.forEach(element => {
        element.style.backgroundColor = 'yellow';
    });
}