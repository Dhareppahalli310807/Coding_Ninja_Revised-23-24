const shoppingCart = (function (){
    //private variable and functions
    let cart = [];
    let total = 0;

    //function calculateTotal
    function calculateTotal(){
        total = cart.reduce((acc, item) => acc + item.price, 0);
    }

    //public methods
    return{
        addItem: function(item){
            cart.push(item);
            calculateTotal();
        },
        getTotal: function(){
            return total;
        },
        getCartContents: function(){
            return cart;
        },
    };
})();
export default shoppingCart;