
function sumOfPrimeNumbers(limit) {
  let answer = 0;
  function isPrime(number) {
        if (number <= 1) {
            return false;
        }
        for (let i = 2; i <= Math.sqrt(number); i++) {
            if (number % i === 0) {
                return false;
            }
        }
        return true;
    }
    for (let i = 2; i <= limit; i++) {
        if (isPrime(i)) {
            answer += i;
        }
    }
  return answer
}
