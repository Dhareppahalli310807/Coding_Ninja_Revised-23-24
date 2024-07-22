import java.util.Scanner;

class Conditional{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println(x:"Even Numbers");
        }else{
            System.out.println(x:"Odd Numbers");
        }
        System.out.println(x:"Outside If");
        scan.close();
    }
}