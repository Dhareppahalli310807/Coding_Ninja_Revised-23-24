//reduce(redFn, intial value);

//function redFn(accumlate, currentValue, currentIndex, arr)

const inputs = [3,3,5,6,8,9];
const sum = inputs.reduce((total, sum)=>{
    return total+sum;
}, 0)
console.log(sum);//34