import java.util.Scanner;

class N_Chose_R{
    public static int facto(int num){
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();


        if(n<0 || r<0){
            System.out.println("Its not a valid Number");
            return;
        }

        int factN = facto(n);
        int factR = facto(r);
        int factNR = facto(n-r);

        int ncr = factN / (factR * factNR);
        System.out.println(ncr);
        scan.close();
    }
}