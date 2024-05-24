function discountCalculator(totalAmount) {
    let answer;
    //Write your code below
    if (totalAmount >= 100) {
        //10% discount
    answer = totalAmount * 0.9;
	} else if (totalAmount >= 50) {
    //5% discount
    answer = totalAmount * 0.95;
	} else {
    	// No discount
    	answer = totalAmount;
	}

	return answer
}
