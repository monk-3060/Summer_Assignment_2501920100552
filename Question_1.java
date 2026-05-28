import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        // Loop from 1 to N and add each value to 'sum'
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
