function calculateAverage(student1Score ,student2Score ,student3Score) {
  let averageScore;
//Write your code here
let score1 = Number(student1Score);
  let score2 = Number(student2Score);
  let score3 = Number(student3Score);
  averageScore = parseFloat((score1 + score2 + score3) / 3);
return averageScore;
}