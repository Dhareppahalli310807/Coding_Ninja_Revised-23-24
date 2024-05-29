// Note:  Please do not change the pre-written code

// import the required module here
const airthmaticSum = require('./math');
const airthmaticMean = require('./math');

const Solution = () => {
    const nums = [1, 2, 3, 4, 5];
    // write your code here to Display the results of the calculations on the console.
    const sumResult = airthmaticSum.sum(nums);
    console.log("Sum:", sumResult);

    const meanResult = airthmaticMean.mean(nums);
    console.log("Mean:", meanResult);


};
Solution();
module.exports = Solution;
