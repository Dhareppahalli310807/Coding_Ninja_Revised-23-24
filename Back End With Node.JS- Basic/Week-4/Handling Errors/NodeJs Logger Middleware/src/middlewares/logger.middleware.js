// Please don't change the pre-written code
// Import the necessary modules here
import fs from 'fs';
// Write your code here

export const loggerMiddleware = async (req, res, next) => {
  // Check if the request URL matches '/api/user'
  if (req.originalUrl === '/api/user' && req.method === 'POST') {
    const timestamp = new Date().toISOString();
    const requestBody = JSON.stringify(req.body);
    const logMessage = `${timestamp} - ${req.method} ${req.originalUrl} - Request Body: ${requestBody}\n`;
    fs.appendFile('log.txt', logMessage, (err) => {
      if (err) {
        console.error('Error writing to log file:', err);
      }
    });
  }
  next();
};
export default loggerMiddleware;
