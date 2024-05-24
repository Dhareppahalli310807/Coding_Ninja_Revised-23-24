const inputs = [4,10,2,-3,-4,7];
const positives = inputs.filter(noNegative);
function noNegative(num){
    return num > 0;
}