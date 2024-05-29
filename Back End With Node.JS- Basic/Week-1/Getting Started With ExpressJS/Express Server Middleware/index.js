// Please don't change the pre-written code.

const express = require("express");
const app = express();

const logRequest = (req, res, next) => {
  // Write your code here
  // Check if the request method is GET and path is "/"
  if (req.method === "GET" && req.path === "/") {
    console.log(req.method);
    console.log(req.path);
  }
  // Move to the next middleware
  next();
};

// This route should only be accessible after passing through the 'logRequest' middleware. 
app.use(logRequest);
// Make necessary changes in the route below.
app.get("/", (req, res) => {
  res.send("Coding Ninjas!");
});

module.exports = app;
