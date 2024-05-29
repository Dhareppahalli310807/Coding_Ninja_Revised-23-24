// Please don't change the pre-written code
// Import the necessary modules here
import winston from 'winston';
// Write your code here
// Configure the winston logger
const logger = winston.createLogger({
  level: 'info',
  format: winston.format.json(),
  transports: [
    new winston.transports.File({ filename: 'combined.log' }),
  ],
});
export const loggerMiddleware = async (req, res, next) => {
  try {
    const timestamp = new Date().toISOString();
    const requestBody = JSON.stringify(req.body);
    logger.info({
      timestamp,
      method: req.method,
      url: req.originalUrl,
      requestBody,
    });
  } catch (error) {
    logger.error('Error logging request:', error);
  }
  next();
};
export default loggerMiddleware;
