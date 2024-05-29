// Please don't change the pre-written code
// Import the necessary modules here
import path from "path";
export const getProducts = (req, res) => {
  // Wite your code here
  const indexPath = path.resolve("src", "views", "index.html");
  // Send the 'index.html' file
  res.sendFile(indexPath);
};
