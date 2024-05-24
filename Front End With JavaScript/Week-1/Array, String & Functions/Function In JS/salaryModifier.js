// Problem statement
// Suppose you have a list of employees in a company, and each employee is represented as an object with the following properties:


// "id" - a unique identifier for the employee
// "name" - the employee's name
// "department" - the department the employee works in
// "salary" - the employee's current salary



// Objectives:

// You want to make a modification to the list of employees to reflect a recent company-wide salary increase. You have been provided with the following information:
// Salaries for employees in the "sales" department should be increased by 10%.
// Salaries for employees in the "engineering" department should be increased by 15%.
// Salaries for employees in all other departments should be increased by 5%.
// You need to write a function "increaseSalaries" that takes an array of employee objects and returns a new array of employee objects where each employee's salary has been updated based on their department. The original array of employees should be left unchanged.

        //complete the increaseSalaries function
        const employees = [
            { id: 1, name: "Alice", department: "sales", salary: 40000 },
            { id: 2, name: "Bob", department: "engineering", salary: 50000 },
            { id: 3, name: "Charlie", department: "marketing", salary: 45000 },
            { id: 4, name: "David", department: "sales", salary: 35000 },
            { id: 5, name: "Emily", department: "engineering", salary: 55000 }
          ];
        function increaseSalaries(employees){
          return employees.map(employee => {
              let salaryIncreasePercentage;
              switch(employee.department) {
                    case 'sales':
                      salaryIncreasePercentage = 0.1;
                  break;
                    case 'engineering':
                      salaryIncreasePercentage = 0.15;
                  break;
                    default:
                      salaryIncreasePercentage = 0.05;
              }
      
              const increasedSalary = (employee.salary * (1 + salaryIncreasePercentage)).toFixed(1);
              return {
                  ...employee, 
                  salary: increasedSalary
              };
              
        });    
        }
      
        