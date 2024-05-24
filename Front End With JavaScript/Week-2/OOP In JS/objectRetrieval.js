// Problem statement
// You have been assigned to develop an advanced User Profile system for a website. The User Profile is represented as an object For Example:

// const userProfile1 = {
// name: "John Doe",
// email: "john.doe@example.com",
// address: {
//   city: "New York",
//   street: "123 Main St",
//   zipCode: "10001"
// }
// };

// const userProfile2 = {
// name: "Marry Jane",
// email: marry.jane@example.com",
// address: {
//   city: "L.A",
//   street: "154, washington road",
//   block: “001”
//   zipCode: "10011"
// }
// };


// Requirement:
// Implement a function called getUserDetail() that takes two parameters:
//    -  a user profile object. 
//    - an array of string keys. 
// The function should retrieve the nested value in the profile that corresponds to the array of keys. If the keys do not lead to a valid nested value, the function should return the string "Not available".


// Expected Output:
// getUserdetails(userprofile2, [address, block]) 
// output : 001
// getUserdetails(userprofile1, [address, block])  
// output: Not available
// getUserdetails(userprofile1, [name])
// output: John Doe

// Hints:
// Utilize a for...of loop to traverse through the array of keys.
// Access object properties dynamically using the for...in loop.

function main(){

    const userProfile = {
    name: "John Doe",
    email: "john.doe@example.com",
    address: {
      city: "New York",
      street: "123 Main St",
      zipCode: "10001"
    }
  };
  const userProfile2 = {
    name: "Marry Jane",
    email: "marry.jane@example.com",
    address: {
      city: "L.A",
      street: "154, washington road",
      block: '0101',
      zipCode: "10011"
    }
  };
  
  function getUserDetail(profile, keys) {
	let nestedValue = profile;
      
    for (const key of keys) {
        if (nestedValue.hasOwnProperty(key)) {
            nestedValue = nestedValue[key];
        } else {
            return "Not available";
        }
    }
        
    return nestedValue;  
  }
  
  
  console.log(getUserDetail(userProfile, ["address", "city"]));
  // Usage: should return "New York"
  //do not modify the return statement
return getUserDetail;
}