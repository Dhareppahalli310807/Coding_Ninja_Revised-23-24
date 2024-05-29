// Import required module
const readline = require('readline');
const Solution = () => {
  // Write your code here
  const sInterface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  //take input from user
  sInterface.question("Enter the first number", (num1)=>{
    sInterface.question("Enter the second number", (num2)=>{
      // Calculate maximum of the two numbers
      const max = Math.max(num1, num2);
      console.log(`The maximum of the two numbers is: ${max}`);
    })
  });
};

Solution();
module.exports = Solution;
