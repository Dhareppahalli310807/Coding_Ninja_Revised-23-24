// Please don't change the pre-written code
// Import the necessary modules here
//import { customErrorHandler } from "./errorHandler.js";
import { logger } from "./logger.middleware.js";
export class customErrorHandler extends Error {
  constructor(statusCode, errMessage) {
    super(errMessage);
    this.statusCode = statusCode;
  }
}

export const errorHandlerMiddleware = (err, req, res, next) => {
  // Write your code here
  if (err instanceof customErrorHandler) {
    // Log the error
    logger.error({
      level: "error",
      timestamp: new Date().toString(),
      requestURL: req.originalUrl,
      errorMessage: err.message
    });

    res.status(err.statusCode).json({ error: err.message });
  } else if (err.statusCode === 505) {
    logger.error({
      level: "error",
      timestamp: new Date().toString(),
      requestURL: req.originalUrl,
      errorMessage: "testing app level custom error handling middleware"
    });
    res.status(505).json({ error: "testing app level custom error handling middleware" });
  } else {
    logger.error({
      level: "error",
      timestamp: new Date().toString(),
      requestURL: req.originalUrl,
      errorMessage: "Oops! Something went wrong... Please try again later!"
    });
    res.status(500).json({ error: "Oops! Something went wrong... Please try again later!" });
  }
};
