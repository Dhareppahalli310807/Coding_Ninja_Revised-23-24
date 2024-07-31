import java.util.Scanner;

class SumOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5]; // Correctly declare the array with 5 elements

        // Read elements into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0; // Initialize sum

        // Calculate the sum of all elements
        for (int i : arr) {
            sum += i;
        }

        // Print the sum of all elements
        System.out.print(sum);
        scan.close();
    }
}
