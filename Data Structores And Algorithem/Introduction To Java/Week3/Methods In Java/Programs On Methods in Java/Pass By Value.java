import java.util.Scanner;

class Methods{
    public static void int sum(int a, int b, int c){
    int s = a + b + c;
    return s;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
       
        System.out.println(sum(a, b, c));
        scan.close();
    }
}
