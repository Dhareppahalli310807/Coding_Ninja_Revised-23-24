// Problem statement
// You are tasked with creating a program for a bank that determines whether a person is eligible for a loan. The eligibility criteria for the loan are as follows:

// Conditions :
// The person must be at least 18 years old.
// The person must have a monthly income of at least $2,000.
// The person must not have any outstanding loans with the bank.
// Hint for Python Users:
// Use the lower() function to take boolean input.
// Like this, has_loans = input("").lower() == 'true'. 
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains the age(an integer) of the person.
// The second line contains the Monthly income (a double). of the person.
// A boolean value indicating whether the person has outstanding loans (true or false).
// Output format :
// Print whether the person is eligible for a loan or not .
// Sample input 1:
// 16
// 27000.78
// true 
// Sample output 1:
// You are not eligible for the loan.
// Sample input 2:
// 30
// 27450.78
// false 
// Sample output 2:
// You are eligible for the loan.



import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double monthlyIncome = scanner.nextDouble();
        boolean hasOutstandingLoans = scanner.nextBoolean();
        if (age >= 18 && monthlyIncome >= 2000 && !hasOutstandingLoans) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }
    }
}
