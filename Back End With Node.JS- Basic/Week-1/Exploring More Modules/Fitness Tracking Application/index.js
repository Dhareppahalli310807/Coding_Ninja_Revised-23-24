import events from "events";

class FitnessTracker extends events.EventEmitter {
  constructor() {
    super();
    this.progress = 0;
    this.goal = 1000;
  }

  addExercise(exercise) {
    // Write code to update the progress and emit a 'goalReached' event when the goal is reached
    // Update progress
    this.progress += exercise.caloriesBurned;
    if (this.progress >= this.goal) {
      // If goal is reached, emit 'goalReached' event
      this.emit('goalReached');
    }
  }
}

const Solution = () => {
  // define  listener that sends a congratulatory message to the user upon reaching their fitness goal
  // Instantiate FitnessTracker
  const tracker = new FitnessTracker(); 
  tracker.on('goalReached', () => {
    console.log("Congratulations! You have reached your fitness goal");
  });
  // simulate adding exercise
  tracker.addExercise({ name: "Running", caloriesBurned: 500 });
  tracker.addExercise({ name: "Weightlifting", caloriesBurned: 600 });
};

Solution();

export { FitnessTracker, Solution };
