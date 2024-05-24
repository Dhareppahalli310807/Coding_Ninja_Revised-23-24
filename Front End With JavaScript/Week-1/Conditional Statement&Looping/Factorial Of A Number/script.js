function factorial(limit) {

    let result = 1;
    if (limit < 0) {
        return "Factorial is not defined for negative numbers";
    } else if (limit === 0 || limit === 1) {
        return 1;
    } else {
        for (let i = 2; i <= limit; i++) {
            result *= i;
        }
        return result;
    }
    return result;
  }
  