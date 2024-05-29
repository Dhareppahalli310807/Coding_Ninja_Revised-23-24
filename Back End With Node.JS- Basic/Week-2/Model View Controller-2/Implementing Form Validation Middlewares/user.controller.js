import { formValidationMiddleware } from "./middleware.js";


export const newUser = (req, res) => {
  res.status(201).send("user added !");
};
