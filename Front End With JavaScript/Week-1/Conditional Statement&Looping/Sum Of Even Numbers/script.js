function sumOfEvenNumbers(limit) {

    let result = 0;
    for (let i = 1; i <= limit; i++) {
        if (i % 2 === 0) {
            result += i;
        }
    }
    return result;
  }
  