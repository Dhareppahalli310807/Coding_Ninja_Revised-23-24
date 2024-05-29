// Please don't change the pre-written code
// Import the necessary modules here
const fs = require('fs');
const Solution = () => {
  // Create and write to notes.txt
  fs.writeFileSync('notes.txt', 'The world has enough coders');

  // display contents of notes.txt
  const contentBefore = fs.readFileSync('notes.txt', 'utf-8');
  console.log(contentBefore);

  // Append to notes.txt
  fs.appendFileSync('notes.txt', '\nBE A CODING NINJA!');

  // display updated contents of notes.txt
  const contentAfter = fs.readFileSync('notes.txt', 'utf-8');
  console.log(contentAfter);
};
Solution();
module.exports = Solution;
