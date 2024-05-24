//Convert the type to numbers
//Calculate the discountedprice
function shoppingDiscountCalculator(originalValue,discountPercentage){
    let answer;
    originalValue = parseFloat(originalValue);
    discountPercentage = parseFloat(discountPercentage);
    // formulla 
    answer = originalValue - (originalValue * (discountPercentage / 100));
return answer
    }