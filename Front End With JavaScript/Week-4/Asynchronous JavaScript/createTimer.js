// Problem statement
// Write a program to print 1 after 1 sec, 2 after 2 sec till 5. Complete the given code to get the desired output as shown in the expected output.

// Expected Output:

function timer() {
    for (let i = 1; i <= 5; i++) {
      setTimeout(
        function () {
          //Write your code here...
            console.log(i);
        }, i * 1000, i//write your code here...);
      );
      console.log("Hello ninjas!");
    }
  }
  timer();
  
  // Do not edit the rest of the code
  