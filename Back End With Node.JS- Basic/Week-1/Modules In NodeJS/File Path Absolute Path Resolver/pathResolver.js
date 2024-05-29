// // Import the necessary modules here.
 const path = require('path');
// exports.getAbsolutePath = (filePath) => {
// // Write your code here
// return path.resolve(__dirname, filePath);
// };


//reading data
const filePath = path.join('src', 'file.txt');// it will give that much path
console.log(filePath);
//src\file.txt
const filePathResolved = path.resolve('src', 'file.txt');// it will give entire path
console.log(filePathResolved);
//C:\Users\Dell\Desktop\Basics\Node_JS\File Path Absolute Path Resolver\src\file.txt