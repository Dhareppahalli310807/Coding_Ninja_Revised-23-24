//Write a program to determine the grade of the student
//Determine the grade and assign it to the result variable.
//Do not alter anything else given in the starter code

function main(marks) {
  let result;
  if (marks >= 90) {
    result = "A";
  } else if (marks >= 80 && marks<= 89) {
    result = "B";
} else if (marks >= 70 && marks<= 79) {
    result = "C";
} else if (marks >= 60 && marks<= 69) {
    result = "D";
} else if(marks< 60){
    result = "F";
}

  return result;
}
