import java.util.Scanner;

class Primes{
    public static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
            if(num%2 == 0){
                return false;
            }
        }
        return true;

    }
    public static void printPrimes(int lim){
        for(int i = 2; i<= lim; i++){
            if(isPrime(i)){
                System.out.prinln(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        printPrimes(limit);
        scan.close();
    }
}


// class Primes{
//     public static void main(String args[]){
//         for(int i = 2; i <= 50; i++){
//             boolean flag = false;
//             for(int j = 2; j < i/2; j++){
//                 if(i % j == 0){
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag == false){
//                 System.out.prinln(i);
//             }
//         }
//     }
// }