// Problem statement
// Suppose you're given an array of objects representing the weather conditions of different cities. Create a function with name calculateAverage that takes threshold pressure as a parameter and returns the average temperature of the cities with a pressure value above a certain threshold.



// Requirements

// The function should have access to the weather object. Specifically, your code should be able to:
// Filter out the objects with a pressure value equal to or above the given threshold. 
// Map each object to create array of temperature. 
// Reduce the temperature values to find the total temperature of the remaining cities. 
// Calculate the average temperature and return the average temperature from the calculateAverage function.
// The average temperature should be up to 1 decimal place i.e. the value should be like "45.3"


// The array is of the format:

// [
//      { city: 'New York', temperature: 50, pressure: 1015 },

//      { city: 'Los Angeles', temperature: 70, pressure: 1010 },

//      { city: 'Chicago', temperature: 40, pressure: 1012 },

//      { city: 'Houston', temperature: 75, pressure: 1020 },

//      { city: 'Miami', temperature: 80, pressure: 1017 },
// ]

// Complete the function calculateAverage
const weather = [
    { city: "New York", temperature: 50, pressure: 1015 },
    { city: "Los Angeles", temperature: 70, pressure: 1010 },
    { city: "Chicago", temperature: 40, pressure: 1012 },
    { city: "Houston", temperature: 75, pressure: 1020 },
    { city: "Miami", temperature: 80, pressure: 1017 }
  ];
  const pressureThreshold = 1015;
  function calculateAverage(pressureThreshold){
  const filteredWeather = weather.filter(city => city.pressure >= pressureThreshold);  
    const temperatures = filteredWeather.map(city => city.temperature);  
    const totalTemperature = temperatures.reduce((sum, temperature) => sum + temperature, 0);
  const averageTemperature = totalTemperature / temperatures.length;  
    return averageTemperature.toFixed(1);    }
  console.log(calculateAverage(pressureThreshold))
  //Output : 68.3