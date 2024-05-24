function isEligible(mathScore , englishScore , scienceScore) {
  let eligibleForAward
  let scholarship = (mathScore > 80 && englishScore > 80) || (mathScore > 80 &&               scienceScore > 80) || (englishScore > 80 && scienceScore > 80);

    let scienceFair = (mathScore + englishScore + scienceScore) >= 250;

    eligibleForAward = scholarship || scienceFair;

	
return eligibleForAward
  
}