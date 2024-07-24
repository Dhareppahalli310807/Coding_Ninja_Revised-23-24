import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i;
        int flag = 0;
        for(i= 2; i<n; i++){
            if(n%i === 0){
              
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println(x:"A prime Number");
        }else{
            System.out.println(x:"Not A prime Number");
        }
    }
}