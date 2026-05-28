package Day_1;

import java.util.Scanner;

public class Question_2 {
       public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Multiplication Table of " + num + ":");
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        
        
        scanner.close();
    }
}
