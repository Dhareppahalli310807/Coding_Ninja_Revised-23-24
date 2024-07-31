import java.util.Scanner;
class Runtime{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr = new int[10];

        for(int i = 0; i< arr.length; i++){
            System.out.print("\n Enter the value at"+ i + "index: ");
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(int i :arr){
             System.out.println(i+ " ");
        }
    }
}