import java.util.*;

public class Isosceles{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n - i){
                System.out.print(' ');
                spaces = spaces + 1;
            }
            int num = 1;
            while(num <= i){
                System.out.print(num);
                num = num + 1;
            }
            int dec = i - 1;
            while(dec >= 1){
                System.out.println(dec);
                dec = dec - 1;

            }
            System.out.println();
            i = i + 1;
        }
    }
}