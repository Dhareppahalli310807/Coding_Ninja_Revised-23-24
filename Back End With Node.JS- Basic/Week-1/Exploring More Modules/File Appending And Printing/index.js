// Please do not change the prewritten code

import http from "http";
import fs from "fs";

const server = http.createServer((req, res) => {
  if (req.method === 'POST') {
    let body = '';
    // Read request body
    req.on('data', (chunk) => {
      body += chunk;
    });
    // Append request body to file
    req.on('end', () => {
      fs.appendFileSync('data.txt', body + '\n');
      // Read and print
      const newContent = fs.readFileSync('data.txt', 'utf8');
      console.log(newContent);
      res.end('data received');
    });
  } else {
    // if method is non-POST
    res.end('it is not Post method');
  }
});
export default server;
