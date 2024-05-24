import cart from "./iifeModulePattern";

//add some items
cart.addItem({id: 1, pName:"Mobile", price: 300});
cart.addItem({id: 1, pName:"Phone", price: 500});
cart.addItem({id: 1, pName:"Laptop", price: 900});

//get the cart container
const cartItems = document.getElementById('cart-items');

//display the cart items
const cartContent = cart.getCartContents();
cartContent.forEach((iteam) =>{
    const listItem = document.createElement('li');
    listItem.textContent = `${iteam.pName} - $${iteam.price}`;
    cartItems.appendChild(listItem);
});

//get the total price element
const totalPriceElement = document.getElementById('total-price');

//display the total price
totalPriceElement.textContent = `Total: $${cart.getTotal()}`;