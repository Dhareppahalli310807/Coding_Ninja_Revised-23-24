// Please don't change the pre-written code

export class customErrorHandler extends Error {
  constructor(statusCode, errMessage) {
    super(errMessage);
    this.statusCode = statusCode;
  }
}

export const errorHandlerMiddleware = (err, req, res, next) => {
  // Write your code here
  if (err instanceof customErrorHandler) {
    res.status(err.statusCode).json({ error: err.message });
  } else {
    // Set response status code to 500 (Internal Server Error)
    res.status(500).json({ error: "Oops! Something went wrong... Please try again later!" });
  }
};
