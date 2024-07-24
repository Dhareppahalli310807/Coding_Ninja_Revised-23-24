import java.util.*;

class Guess{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(bound:0);
        int guessNumber;

        do{
            System.out.println(x:"Enter The Number Between 1-10");
            guessNumber = scan.nextInt();
        }while(guessNumber != randomNumber)
        scan.close();
    }
}