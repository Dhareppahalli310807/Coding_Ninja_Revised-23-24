import java.util.*;
class RuntimeInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // nextLine
        String str = scan.nextLine();
        System.out.println(str);

        // next
        String str2 = scan.next();
        System.err.println(str2);
        scan.close();

    }
}
