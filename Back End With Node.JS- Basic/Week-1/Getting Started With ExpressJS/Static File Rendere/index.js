// Please don't change the pre-written code

const express = require("express");
const server = express();
const path = require("path");

const renderStatic = () => {
  // Write your code here
  const staticPath = path.join(__dirname, "public");
  console.log("Static files served from:", staticPath);
  // Serve static files from the 'static' directory
  server.use(express.static(staticPath));
  };

server.get("/", (req, res) => {
  res.send("get method called!");
});

renderStatic();

module.exports = { renderStatic, server };
