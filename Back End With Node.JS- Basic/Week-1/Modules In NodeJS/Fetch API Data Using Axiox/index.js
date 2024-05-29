// Please do not change the prewritten code
const axios = require('axios');
const Solution = async () => {
  // try block and catch block
  try {
    // here we are making  HTTP GET request to the API endpoint
    const resp = await axios.get('https://api.codingninjas.com/api/v3/event_tags');
    const respData = resp.data;
    // consoling the resp
    console.log(resp.data);
  } catch (error) {
    // errors if any
    console.error('Error :', error.message);
  }
};
Solution();
module.exports = Solution;
