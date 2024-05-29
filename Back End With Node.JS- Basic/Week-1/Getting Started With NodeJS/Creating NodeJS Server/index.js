// Please don't change the pre-written code
// Import the necessary modules here

// 1.import https lib
const http = require('http');

// 2.Create a server instance
const server = http.createServer((req, res) => {
  // Send the response body
  res.end('Response received at port 8080.\n');
});

// add the server to listen on port 8080
server.listen(8080);

// Export the server instance
module.exports = server;
