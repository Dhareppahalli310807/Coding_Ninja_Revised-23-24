function compoundInterest (principalAmount , annualInterestRate , numberOfYears)
{ 
    let answer;
 	answer = principalAmount;
    
    for (let i = 0; i < numberOfYears; i++) {
        answer += answer * annualInterestRate;
    }
    return answer;
}