/*write a program to determine wether a student is eligible for a scholarship based on there grades or stars recived in sports 
schlorship cutoff=65
GPA should be >=3.5
stars in sports>=3
*/
import java.util.*;

class scholarship{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println(x:"Enter The marks");
        double marks = scan.nextDouble();

        System.out.println(x:"Enter The GPA");
        double gpa= scan.nextDouble();

        System.out.println(x:"Enter The stars in sports");
        int stars= scan.nextInt();

        scan.close();
        if( marks>= 65 && gpa>=3.5 || stars>=3){
            System.out.println(x:"Congratulation You Are Eligible...");
        }else{
            System.out.println(x:"We are sorry! You are not eligible..");
        }
        scan.close();
    }
}