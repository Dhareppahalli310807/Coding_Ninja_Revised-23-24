// Please don't change the pre-written code

const express = require("express");
const server = express();

// Write your code here
// GET requests
server.get("/", (req, res) => {
    res.send("get");
  });
  
// POST requests
server.post("/", (req, res) => {
    res.send("post");
  });
  
// PUT requests
  server.put("/", (req, res) => {
    res.send("put");
  });
  
// DELETE requests
  server.delete("/", (req, res) => {
    res.send("delete");
  });

module.exports = server;
