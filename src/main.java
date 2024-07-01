import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Insert grades and round if matches the condition
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            arr[i] = roundGrades(num);
        }

        // Print the grades
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int roundGrades(int num) {
        if ((num >= 38) && (num % 5 >= 3)) {
            return num + (5 - num % 5);
        }
        return num;
    }
}
