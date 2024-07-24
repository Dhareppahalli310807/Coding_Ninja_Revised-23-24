import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n ; j++){
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
    }
}