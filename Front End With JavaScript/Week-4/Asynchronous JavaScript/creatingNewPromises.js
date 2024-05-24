
// Problem statement
// You are a student who wants to keep track of your fitness progress.

// Requirements:

// Requirement 1:

// Write a function called trackFitness that takes in the following parameters:

// 1- exercise(string): The name of the exercise you performed
// 2- duration(number): The duration of the exercise in minutes.
// Requirement 2:

// The trackFitness function should perform the following steps:

// 1- If the duration is greater than 0, Print a message indicating the exercise you performed and the duration, and then simulate the process of tracking your fitness by creating a promise that resolves after a delay of 5 seconds. The resolved value should be the duration of the exercise.

// 2- If the duration is less than 0, it should reject the promise with the statement "Invalid duration. Please provide a positive number."


function trackFitness(exercise, duration) {
    //Implement your promise here
    return new Promise((resolve, reject) => {
        if (duration > 0) {
            console.log(`Performed ${exercise} for ${duration} minutes.`);
            setTimeout(() => {
                resolve(duration);
            }, 5000); // Simulating delay of 5 seconds
        } else {
            reject("Invalid duration. Please provide a positive number.");
        }
    });
  }
  trackFitness("Running", 30)
    .then((duration) => {
      console.log(`Total duration: ${duration} minutes.`);
    })
    .catch((error) => {
      console.log(`Failed to track fitness: ${error}`);
    });